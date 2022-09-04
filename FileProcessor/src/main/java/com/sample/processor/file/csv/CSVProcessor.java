package com.sample.processor.file.csv;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.sample.processor.file.csv.model.Column;
import com.sample.processor.file.csv.model.Row;
import com.sample.processor.file.processor.FileProcessor;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CSVProcessor<T> implements FileProcessor<CSVFile<String>> {
	
	private final static Logger LOG = LoggerFactory.getLogger(CSVProcessor.class);
	private static final String  DELIMETER = ","; 
	private static final String  NEW_LINE = "\n"; 
	
	
	@Override
	public CSVFile<String> processFile(Reader r) {
		CSVFile<String> csvFile = new CSVFile<>();
		CSVReader reader = new CSVReader(r);
		List<Row<String>> rows = new ArrayList<>();
		StringBuilder csvContent = new StringBuilder();
		try {
			List<String[]> content =reader.readAll();
			for(int i=0;i<content.size();i++) {
				List<Column<String>> coulmnList = new ArrayList<>(); 
				Row<String> row = new Row<>();
				String arr[] = content.get(i);
				for(int j=0;j<arr.length;j++) {
					csvContent.append(arr[j]+DELIMETER);
					Column<String> col = new Column<String>(arr[j]);
					coulmnList.add((Column<String>) col);
				}
				csvContent.append(NEW_LINE);
				row.setRows(coulmnList);
				rows.add(row);
			}
		} catch (IOException | CsvException e) {
			LOG.info(e.getMessage());
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				LOG.info(e.getMessage());
			}
		}
		csvFile.setRows(rows);
		csvFile.setContent(csvContent.toString());
		return csvFile;
		
	}



}
