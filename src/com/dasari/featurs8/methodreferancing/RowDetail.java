package com.dasari.featurs8.methodreferancing;

public class RowDetail {
	private Integer rowId;
	private String rowName;

	public RowDetail() {

	}

	public Integer getRowId() {
		return rowId;
	}

	public RowDetail setRowId(Integer rowId) {
		this.rowId = rowId;
		return this;
	}

	public String getRowName() {
		return rowName;
	}

	public RowDetail setRowName(String rowName) {
		this.rowName = rowName;
		return this;
	}

	@Override
	public String toString() {
		return "RowDetail [rowId=" + rowId + ", rowName=" + rowName + "]";
	}

}
