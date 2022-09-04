package com.sample.processor.file.csv.model;

public class CSVDTO {
	
	private long uniqueUserIds;
	private long duplicateUserIds;
	private long duplicateRows;

	
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
