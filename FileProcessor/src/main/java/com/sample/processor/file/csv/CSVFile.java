package com.sample.processor.file.csv;

import java.util.List;
import java.util.Map;

import com.sample.processor.file.csv.model.Row;
import com.sample.processor.file.csv.model.types.CSV;

@CSV
public class CSVFile<T> {
	

	private Map<Integer,String> header;
	private List<Row<T>> rows;
	private String content;

	public CSVFile() {

	}

	public List<Row<T>> getRows() {
		return rows;
	}

	public void setRows(List<Row<T>> rows) {
		this.rows = rows;
	}
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public Map<Integer, String> getHeader() {
		return header;
	}

	public void setHeader(Map<Integer, String> header) {
		this.header = header;
	}


}
