package com.sample.processor.file.csv.model;

import java.util.Objects;

public class Column<T> {
	
	
	private T t;

	public Column(T t) {
		super();
		this.t = t;
	}
	
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public int hashCode() {
		return Objects.hash(t);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Column))
			return false;
		Column<?> other = (Column<?>) obj;
		return Objects.equals(t, other.t);
	}


	@Override
	public String toString() {
		return "Column [t=" + t + "]";
	}




}
