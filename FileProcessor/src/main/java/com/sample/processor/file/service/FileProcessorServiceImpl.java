package com.sample.processor.file.service;

import java.io.Reader;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sample.processor.file.csv.CSVFile;
import com.sample.processor.file.csv.CSVProcessor;
import com.sample.processor.file.csv.builder.CSVStatsService;
import com.sample.processor.file.csv.entity.FileData;
import com.sample.processor.file.csv.mapper.CSVMapper;
import com.sample.processor.file.csv.model.CSVDTO;
import com.sample.processor.file.csv.model.Row;
import com.sample.processor.file.csv.repository.FileRepostory;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FileProcessorServiceImpl implements FileProcessorService {
	
	private final static Logger LOG = LoggerFactory.getLogger(FileProcessorServiceImpl.class);
	
	private final CSVProcessor<CSVFile<String>> csvProcessor;
	private final CSVStatsService csvStatsService;
	private final FileRepostory fileRepository;
	private final CSVMapper csvMapper;
	 
	

	

	public FileProcessorServiceImpl(CSVProcessor<CSVFile<String>> csvProcessor, CSVStatsService csvStatsService,
			FileRepostory fileRepository, CSVMapper csvMapper) {
		super();
		this.csvProcessor = csvProcessor;
		this.csvStatsService = csvStatsService;
		this.fileRepository = fileRepository;
		this.csvMapper = csvMapper;
	}




	@Override
	public void processCSV(Reader r) {
		CSVFile<String> csvFile =csvProcessor.processFile(r);
		List<Row<String>> rows = csvFile.getRows();
		FileData data = new FileData();
		data.setData(csvFile.getContent());
		data.setDuplicateRows(csvStatsService.duplicateRows(rows));
		data.setUniqueUserIds(csvStatsService.uniqueUserIds(rows));
		data.setDuplicateUserIds(csvStatsService.duplicateUserIds(rows));
		fileRepository.save(data);
		LOG.info("Saved to DB ::");
		
	}




	@Override
	public CSVDTO mapCSVData(long csvId) {
		return csvMapper.mapCSVdata(fileRepository.findById(csvId).get());
	}


}
