package com.sample.processor.file.csv.builder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sample.processor.file.csv.CSVConstants;
import com.sample.processor.file.csv.model.Column;
import com.sample.processor.file.csv.model.Row;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CSVStatsServiceImpl implements CSVStatsService{
	private final static Logger LOG = LoggerFactory.getLogger(CSVStatsServiceImpl.class);
	@Override
	public long duplicateRows(List<Row<String>> rows) {
		Set<String> recordsSet = new HashSet();
		for(Row<String> row:rows) {
			StringBuilder str  = new StringBuilder();
			for(Column<String> col: row.getColumns()) {
				str.append(col.toString());
				
			}
			recordsSet.add(str.toString());	
		}
		LOG.info("Total ::" + rows.size());
		LOG.info("distinct ::" +recordsSet.size());
		return (rows.size()-recordsSet.size());
		
	}

	@Override
	public long duplicateUserIds(List<Row<String>> rows) {
		Map<String,String> emailMap =new HashMap<>();
		for(Row<String> row:rows) {
			emailMap.put(row.getColumns().get(CSVConstants.CSV_HEADER.get(CSVConstants.USER_ID)).toString(), row.getColumns().get(CSVConstants.CSV_HEADER.get(CSVConstants.EMAIL_ID)).toString());
		}
		LOG.info("Email map string duplicate == :"+emailMap.toString());
		LOG.info("Email map size"+emailMap.size());
		return emailMap.size();
	}

	@Override
	public long uniqueUserIds(List<Row<String>> rows) {
		Map<String,String> emailMap =new HashMap<>();
		for(Row<String> row:rows) {
			emailMap.put(row.getColumns().get(CSVConstants.CSV_HEADER.get(CSVConstants.EMAIL_ID)).toString(), row.getColumns().get(CSVConstants.CSV_HEADER.get(CSVConstants.USER_ID)).toString());
		}
		LOG.info("Email map string :"+emailMap.toString());
		LOG.info("Email map size"+emailMap.size());
		return emailMap.size();
	}



}
