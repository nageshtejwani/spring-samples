package com.sample.processor.file.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sample.processor.file.csv.model.CSVDTO;
import com.sample.processor.file.service.FileProcessorService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class InputController {

	private static final Logger LOG = LoggerFactory.getLogger(InputController.class);
	private static final String TEMP_FILE_PATH = "src/main/resources/targetFile.csv";
	private final FileProcessorService fileProcessorService;
	

	public InputController(FileProcessorService fileProcessorService) {
		super();
		this.fileProcessorService = fileProcessorService;
	}

	@PostMapping("/csv")
	public ResponseEntity<HttpStatus> pushCSVData(@RequestParam("csvFile") MultipartFile csvFile) {

		try {
			File file = new File(TEMP_FILE_PATH);
			try (OutputStream os = new FileOutputStream(file)) {
			    os.write(csvFile.getBytes());
			}
			BufferedReader br = new BufferedReader(new FileReader(file));
			fileProcessorService.processCSV(br);
		} catch (IOException e) {
			LOG.info(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/csv")
	public ResponseEntity<CSVDTO> getCSVSTats(@RequestParam("csvId") long csvId) {
		return  ResponseEntity.ok( fileProcessorService.mapCSVData(csvId));
		
	}

}
