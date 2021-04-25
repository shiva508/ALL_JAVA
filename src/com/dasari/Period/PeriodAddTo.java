package com.dasari.Period;

import java.time.LocalDateTime;
import java.time.Period;

public class PeriodAddTo {

	public static void main(String[] args) {
		Period period=Period.of(27,9,23);
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		dateTime=(LocalDateTime) period.addTo(dateTime);
		System.out.println(dateTime);
	}

}
