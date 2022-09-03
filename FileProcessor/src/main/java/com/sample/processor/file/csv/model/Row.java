package com.sample.processor.file.csv.model;

import java.util.List;
import java.util.Objects;

public class Row<T> {


	@Override
	public String toString() {
		return "Row [columns=" + columns + "]";
	}

	private List<Column<T>> columns;
	@Override
	public int hashCode() {
		return Objects.hash(columns);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Row))
			return false;
		Row<?> other = (Row<?>) obj;
		return Objects.equals(columns, other.columns);
	}

	public List<Column<T>> getColumns() {
		return columns;
	}

	public void setRows(List<Column<T>> columns) {
		this.columns = columns;
	}


}
