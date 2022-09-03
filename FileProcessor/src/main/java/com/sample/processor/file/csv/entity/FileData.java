package com.sample.processor.file.csv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class FileData {
	

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="DATA")
	private String data;

	@Column(name="UNIQUE_USER_IDS")
	private long uniqueUserIds;
	
	@Column(name="DUPLICATE_USER_IDS")
	private long duplicateUserIds;
	
	
	@Column(name="DUPLICATE_ROWS")
	private long duplicateRows;
	

	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public long getUniqueUserIds() {
		return uniqueUserIds;
	}


	public void setUniqueUserIds(long uniqueUserIds) {
		this.uniqueUserIds = uniqueUserIds;
	}


	public long getDuplicateUserIds() {
		return duplicateUserIds;
	}


	public void setDuplicateUserIds(long duplicateUserIds) {
		this.duplicateUserIds = duplicateUserIds;
	}


	public long getDuplicateRows() {
		return duplicateRows;
	}


	public void setDuplicateRows(long duplicateRows) {
		this.duplicateRows = duplicateRows;
	}


}
