package com.dasari.date;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateToJavaTime {
	public static void main(String[] args) {
		ZoneId defaultZoneId = ZoneId.systemDefault();
		System.out.println("System Default TimeZone : " + defaultZoneId);
		Date data = new Date();
		System.out.println(data);
		Instant instant = data.toInstant();
		System.out.println(instant);
		// 3. Instant + system default time zone + toLocalDateTime() = LocalDateTime
		LocalDateTime localDateTime = instant.atZone(defaultZoneId).toLocalDateTime();
		System.out.println("localDateTime : " + localDateTime);

		// 4. Instant + system default time zone = ZonedDateTime
		ZonedDateTime zonedDateTime = instant.atZone(defaultZoneId);
		System.out.println("zonedDateTime : " + zonedDateTime);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		System.out.println(dateFormat.format(data));
	}

}
