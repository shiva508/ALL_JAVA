package com.dasari.featurs8.ListToMap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapClient {
	public static void main(String[] args) {
		List<FacultyData> facultyDatas = List.of(
				new FacultyData().setDepartmentCode("ECE").setFacultyName("Vara Prasad"),
				new FacultyData().setDepartmentCode("CSE").setFacultyName("Venkat"),
				new FacultyData().setDepartmentCode("CSE").setFacultyName("Sridevi"));

		Map<String, List<FacultyData>> byDepartment = facultyDatas.stream()
				.collect(Collectors.groupingBy(FacultyData::getDepartmentCode, Collectors.toList()));
		Map<String, Long> byDepartmentCount = facultyDatas.stream()
				.collect(Collectors.groupingBy(FacultyData::getDepartmentCode, Collectors.counting()));
		System.out.println(byDepartment);
		System.out.println(byDepartmentCount);

	}

}
