package com.dasari.featurs8.groupingby;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import com.dasari.featurs8.methodreferancing.RowDetail;

public class GroupingByClient {
	public static void main(String[] args) {

		List<String> names=Arrays.asList("Shva","Nithya","Shva","Nithya","Satish","Mamatha","Reajeshwary","Gop","Ravi","Mounika","Kavya");
		Map<String,Long> namesMap=names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(namesMap);
		System.out.println("==============================================");
		Map<String, Long> sortedMap = new LinkedHashMap<>();
		namesMap.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByKey().reversed()).forEachOrdered(data->sortedMap.put(data.getKey(), data.getValue()));
		System.out.println(sortedMap);
		System.out.println("==============================================");
		List<RowDetail> details = Arrays.asList(new RowDetail().setRowId(1).setRowName("8"),new RowDetail().setRowId(26).setRowName("z"),new RowDetail().setRowId(1).setRowName("A"),
				new RowDetail().setRowId(7).setRowName("B"), new RowDetail().setRowId(5).setRowName("A"),
				new RowDetail().setRowId(4).setRowName("B"));
		Map<String, Long> result = details.stream()
				.collect(Collectors.groupingBy(RowDetail::getRowName, Collectors.counting()));
		result.forEach((key, value) -> System.out.println(key + "=" + value));
		System.out.println("========================================================");
		Map<String, Integer> summing = details.stream()
				.collect(Collectors.groupingBy(RowDetail::getRowName, Collectors.summingInt(RowDetail::getRowId)));
		summing.forEach((key, value) -> System.out.println(key + "=" + value));
		System.out.println("=====================================");
		Map<Integer, List<RowDetail>> groupingByObjMapping=details.stream().collect(Collectors.groupingBy(RowDetail::getRowId));
		System.out.println(groupingByObjMapping);
		System.out.println("=====================================");
		Map<Integer,Set<String>> groupingByMapping=details.stream().collect(Collectors.groupingBy(
				RowDetail::getRowId,Collectors.mapping(RowDetail::getRowName, Collectors.toSet())));
		System.out.println(groupingByMapping);
	}
}
