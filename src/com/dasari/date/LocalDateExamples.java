package com.dasari.date;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateExamples {
	public static void createLocalDate() {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		LocalDate localDate2 = LocalDate.now(Clock.systemDefaultZone());
		System.out.println(localDate2);

		LocalDate localDate3 = LocalDate.now(Clock.system(ZoneId.of("Indian/Cocos")));
		System.out.println(localDate3);

		LocalDate localDate4 = LocalDate.of(1991, Month.AUGUST, 8);
		System.out.println(localDate4);

		LocalDate localDate5 = LocalDate.of(1990, 8, 6);
		System.out.println(localDate5);

		LocalDate localDate6 = LocalDate.of(2004, Month.JANUARY, 8);
		/* LocalDate APIs to get Year, Month, Day from LocalDate */

		System.out.println("Year:" + localDate.getYear());
		System.out.println("Month:" + localDate.getMonthValue());
		System.out.println("Day:" + localDate.getDayOfMonth());
		System.out.println("Day:" + localDate.getDayOfWeek());
		/*
		 * LocalDate APIs to Add or Subtract Days, Months, Weeks and Years to LocalDat
		 */
		System.out.println("Addition of Days:" + localDate.plusDays(2));
		System.out.println("Addition of Week:" + localDate.plusWeeks(48));
		System.out.println("Addition of Months:" + localDate.plusMonths(7));
		System.out.println("Addition of Years:" + localDate.plusYears(2));

		System.out.println("Subtraction of Days:" + localDate.minusDays(2));
		System.out.println("Subtraction of Week:" + localDate.minusWeeks(48));
		System.out.println("Subtraction of Months:" + localDate.minusMonths(7));
		System.out.println("Subtraction of Years:" + localDate.minusYears(2));

		/* LocalDate APIs to compare LocalDate objects */

		if (localDate.isEqual(localDate6)) {
			System.out.println("equals");
		} else {
			System.out.println("not equals");
		}

		if (localDate4.isBefore(localDate6)) {
			System.out.println("Before ");
		} else {
			System.out.println("Not Before ");
		}

		if (localDate6.isAfter(localDate)) {
			System.out.println("After");
		} else {
			System.out.println("Not After");
		}

		/* is Some day */
		if (localDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
			System.out.println("TUESDAY");
		} else {
			System.out.println("Not TUESDAY");
		}

		/* LocalDate APIs to Get Number of Days from Month or Year from LocalDate */

		System.out.println("Number of days in:" + localDate4.getMonth() + " are " + localDate4.lengthOfMonth());
		System.out.println("Number of days in:" + localDate6.getMonth() + " are " + localDate6.lengthOfMonth());

		System.out.println("Number of days in:" + localDate4.getYear() + " are " + localDate4.lengthOfYear());
		System.out.println("Number of days in:" + localDate6.getYear() + " are " + localDate6.lengthOfYear());
		/* LocalDate API to Check If a Given Year Is Leap Year or Not */
		if(localDate4.isLeapYear()) {
			System.out.println("Leaf Year");
		}else {
			System.out.println("Not Leaf Year");
		}
		
		if (localDate6.isLeapYear()) {
			System.out.println("Leaf Year");
		}else {
			System.out.println("Not Leaf Year");
		}
		/* LocalDate API to Convert String to LocalDate in java */
		LocalDate localDate7=LocalDate.parse("2017-05-03", DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(localDate7);
		
		LocalDate localDate8=LocalDate.parse("2017/05/12", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println(localDate8);
		
		LocalDate localDate9=LocalDate.parse("May 05, 2017", DateTimeFormatter.ofPattern("MMM dd, yyyy"));
		System.out.println(localDate9);
		
		LocalDate localDate10=LocalDate.parse("12-Jan-2017", DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
		System.out.println(localDate10);
		LocalDate localDate11=LocalDate.parse("12-01-2017", DateTimeFormatter.ofPattern("dd-LL-yyyy"));
		System.out.println(localDate11);
		/*LocalDate APIs to Convert LocalDate to String in java*/
		
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(localDate.format(dateTimeFormatter));
		DateTimeFormatter dateTimeFormatter2=DateTimeFormatter.ofPattern("MMM dd, yyyy");
		System.out.println(localDate.format(dateTimeFormatter2));
		DateTimeFormatter dateTimeFormatter3=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(localDate.format(dateTimeFormatter3));
		DateTimeFormatter dateTimeFormatter4=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		System.out.println(localDate.format(dateTimeFormatter4));
		DateTimeFormatter dateTimeFormatter5=DateTimeFormatter.ofPattern("dd-LL-yyyy");
		System.out.println(localDate.format(dateTimeFormatter5));
		
	}

	public static void main(String[] args) {
		createLocalDate();
	}
}
