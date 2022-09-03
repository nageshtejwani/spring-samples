package com.sample.processor.file.csv.builder;

import java.util.List;

import com.sample.processor.file.csv.model.Row;

public interface CSVStatsService {

	long duplicateRows(List<Row<String>> rows);
	long duplicateUserIds(List<Row<String>> rows);
	long uniqueUserIds(List<Row<String>> rows);
	
}
