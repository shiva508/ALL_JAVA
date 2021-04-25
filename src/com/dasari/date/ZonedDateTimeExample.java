package com.dasari.date;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
	public static void createZonedDateTime() {
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);
		ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(zonedDateTime1);
		ZonedDateTime zonedDateTime2 = ZonedDateTime.now(Clock.systemDefaultZone());
		System.out.println(zonedDateTime2);
		ZonedDateTime zonedDateTime3 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("GMT"));
		System.out.println(zonedDateTime3);
		ZonedDateTime zonedDateTime4 = ZonedDateTime.of(LocalDateTime.of(2000, Month.AUGUST, 1, 1, 1),
				ZoneId.of("Europe/London"));
		System.out.println(zonedDateTime4);

		LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
		System.out.println(localDateTime);

		LocalDate localDate = zonedDateTime.toLocalDate();
		System.out.println(localDate);

		LocalTime localTime = zonedDateTime.toLocalTime();
		System.out.println(localTime);

		OffsetDateTime offsetDateTime = zonedDateTime.toOffsetDateTime();
		System.out.println(offsetDateTime);
		Instant instant = zonedDateTime.toInstant();
		System.out.println(instant);

		System.out.println("Year:" + zonedDateTime.getYear() + ",Month:" + zonedDateTime.getMonth() + ",Day of Month:"
				+ zonedDateTime.getDayOfMonth() + ",Day of Week:" + zonedDateTime.getDayOfWeek() + ",Day of Year:"
				+ zonedDateTime.getDayOfYear() + ",Zone id:" + zonedDateTime.getZone() + ",Offset"
				+ zonedDateTime.getOffset());
		/* ZonedDateTime APIs to get Hour, Minute, Second from ZonedDateTime */
		System.out.println("Hour : " + zonedDateTime.getHour());
		System.out.println("Minute : " + zonedDateTime.getMinute());
		System.out.println("Second : " + zonedDateTime.getSecond());
		System.out.println("Nano : " + zonedDateTime.getNano());
		// LocalzonedDateTime's plus methods
		System.out.println("Addition of days : " + zonedDateTime.plusDays(5));
		System.out.println("Addition of months : " + zonedDateTime.plusMonths(15));
		System.out.println("Addition of years : " + zonedDateTime.plusYears(5));
		System.out.println("Addition of Hours : " + zonedDateTime.plusHours(2));
		System.out.println("Addition of Minutes : " + zonedDateTime.plusMinutes(30));
		System.out.println("Addition of Seconds : " + zonedDateTime.plusSeconds(20));
		System.out.println("Addition of Weeks : " + zonedDateTime.plusWeeks(2));
		System.out.println("Addition of Nano : " + zonedDateTime.plusNanos(2000));

		// LocalzonedDateTime's minus methods
		System.out.println("Subtraction of days : " + zonedDateTime.minusDays(5));
		System.out.println("Subtraction of months : " + zonedDateTime.minusMonths(15));
		System.out.println("Subtraction of years : " + zonedDateTime.minusYears(5));
		System.out.println("Subtraction of Hours : " + zonedDateTime.minusHours(2));
		System.out.println("Subtraction of Minutes : " + zonedDateTime.minusMinutes(30));
		System.out.println("Subtraction of Seconds : " + zonedDateTime.minusSeconds(20));
		System.out.println("Subtraction of Weeks : " + zonedDateTime.minusWeeks(2));
		System.out.println("Subtraction of Nano : " + zonedDateTime.minusNanos(2000));
	}

	public static void main(String[] args) {
		createZonedDateTime();
	}
}
