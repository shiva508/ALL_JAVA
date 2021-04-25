package com.dasari.date;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateTimeExample {
	public static void localDateTime() {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		LocalDateTime localDateTime1 = LocalDateTime.now(ZoneId.of("UTC"));
		System.out.println(localDateTime1);
		LocalDateTime localDateTime2 = LocalDateTime.now(Clock.systemUTC());
		System.out.println(localDateTime2);
		LocalDateTime localDateTime3 = LocalDateTime.of(1991, Month.AUGUST, 8, 8, 8);
		System.out.println(localDateTime3);
		
		/* LocalDateTime APIs to get year, month, day from LocalDateTime */
		System.out.println("Year=" + localDateTime.getYear() + ",Month=" + localDateTime.getMonth() + ",Day of Month="
				+ localDateTime.getDayOfMonth() + ",Day of Week=" + localDateTime.getDayOfWeek() + ",Day of Year="
				+ localDateTime.getDayOfYear());

		/* LocalDateTime APIs to get Hour, Minute, Second from LocalDateTime */
		System.out.println("Hours=" + localDateTime.getHour() + ",minuts=" + localDateTime.getMinute() + ",seconds="
				+ localDateTime.getSecond());
		
		/*
		 * LocalDateTime APIs to add or subtract years, months, days, hours, minutes and
		 * seconds to LocalDateTime
		 */
		// LocalDateTime's plus methods
		  System.out.println("Addition of days : " + localDateTime.plusDays(5));
		  System.out.println("Addition of months : " + localDateTime.plusMonths(15));
		  System.out.println("Addition of years : " + localDateTime.plusYears(5));
		  System.out.println("Addition of Hours : " + localDateTime.plusHours(2));
		  System.out.println("Addition of Minutes : " + localDateTime.plusMinutes(30));
		  System.out.println("Addition of Seconds : " + localDateTime.plusSeconds(20));

		  // LocalDateTime's minus methods
		  System.out.println("Subtraction of days : " + localDateTime.minusDays(5));
		  System.out.println("Subtraction of months : " + localDateTime.minusMonths(15));
		  System.out.println("Subtraction of years : " + localDateTime.minusYears(5));
		  System.out.println("Subtraction of Hours : " + localDateTime.minusHours(2));
		  System.out.println("Subtraction of Minutes : " + localDateTime.minusMinutes(30));
		  System.out.println("Subtraction of Seconds : " + localDateTime.minusSeconds(20));
		/*  LocalDateTime APIs to compare LocalDateTime objects in Java*/
		  
		  LocalDateTime dateTime1 = LocalDateTime.of(2017, 05, 22, 10, 55, 25);
		  LocalDateTime dateTime2 = LocalDateTime.of(2017, 06, 11, 05, 35, 26);
		  LocalDateTime dateTime3 = LocalDateTime.of(2017, 05, 22, 10, 55, 25);
		  // Using isBefore() method
		  if (dateTime1.isBefore(dateTime2)) {
		   System.out.println("dateTime1 is before dateTime2");
		  }

		  // Using isAfter() method
		  if (dateTime2.isAfter(dateTime3)) {
		   System.out.println("dateTime2 is after dateTime3");
		  }

		  // Using isEqual() method
		  if (dateTime1.isEqual(dateTime3)) {
		   System.out.println("dateTime1 is equal to dateTime3");
		  }

		  // Using compareTo() method
		  if (dateTime1.compareTo(dateTime3) == 0) {
		   System.out.println("dateTime1 is equal to dateTime3");
		  }
		  
		
		 /* LocalDateTime APIs to convert from LocalDateTime to LocalTime in Java*/
		  LocalTime localTime=localDateTime.toLocalTime();
		  System.out.println(localTime);
		  /* LocalDateTime API to convert from LocalDateTime to LocalDate in Java */
		  LocalDate localDate=localDateTime.toLocalDate();
		  System.out.println(localDate);

	}

	public static void main(String[] args) {
		localDateTime();

	}

}
