package com.dasari.featurs8.methodreferancing;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaMethodReferanceClient {
	public static void main(String[] args) {
		List<String> listOfNames=Arrays.asList("Shiva","Nithya","Data","Element");
		listOfNames.stream().filter("A"::startsWith);
		
		List<RowDetail> details=Arrays.asList(new RowDetail().setRowId(1).setRowName("A"),
				new RowDetail().setRowId(7).setRowName("B"),
				new RowDetail().setRowId(5).setRowName("A"),
				new RowDetail().setRowId(4).setRowName("B"));
		Map<String,Long> result=details.stream().collect(Collectors.groupingBy(RowDetail::getRowName,Collectors.counting()));
		result.forEach((key,value)->System.out.println(key+"="+value));
	}
}
