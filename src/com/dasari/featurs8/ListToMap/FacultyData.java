package com.dasari.featurs8.ListToMap;

public class FacultyData {
	private String facultyName;
	private String departmentCode;

	public FacultyData() {

	}

	public FacultyData(String facultyName, String departmentCode) {
		super();
		this.facultyName = facultyName;
		this.departmentCode = departmentCode;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public FacultyData setFacultyName(String facultyName) {
		this.facultyName = facultyName;
		return this;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public FacultyData setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
		return this;
	}

	@Override
	public String toString() {
		return "FacultyData [facultyName=" + facultyName + ", departmentCode=" + departmentCode + "]";
	}

}
