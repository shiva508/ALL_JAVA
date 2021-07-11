package com.dasari.featurs8.functionalprogramming;

import java.util.List;

public class CityClient {
	public static String cityAscert="Nizamabad";
	public static void main(String[] args) {
		
		List<String> cities = List.of("Thalla Malka puram","Gunjalur","Nizamabad");
		
		boolean isCityFound=beforeJava8(cities);
		boolean isCityFoundWay=beforeJava8BetterWay(cities);
	}
	private static boolean beforeJava8BetterWay(List<String> cities) {
		return cities.contains(cities);
	}
	private static boolean beforeJava8(List<String> cities) {
		boolean isCityFound=false;
		for(String city:cities) {
			if(cityAscert.equals(cities)) {
				isCityFound=true;
			}
		}
		return isCityFound;
	}
}
