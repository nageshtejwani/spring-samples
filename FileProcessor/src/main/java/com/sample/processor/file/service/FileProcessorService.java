package com.sample.processor.file.service;

import java.io.Reader;

import com.sample.processor.file.csv.model.CSVDTO;

public interface FileProcessorService {
	
	 void processCSV(Reader r);
	 CSVDTO mapCSVData(long csvId);

}
