package com.dasari.date;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample {
	public static void dateCreataion() {
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		System.out.println("Display data by HH::MM::"+localTime.getHour()+"-"+localTime.getMinute()+"-"+localTime.getSecond()+"-"+localTime.getNano());
		System.out.println("Operations on Date(+,-)"+localTime.plusHours(1)+"--"+localTime.minusHours(2)+"--"+localTime.plusMinutes(20)+"--"+localTime.minusMinutes(10));
		
		
		LocalTime localTime2=LocalTime.of(8, 8, 8);
		System.out.println(localTime2);
		
		LocalTime localTime3=LocalTime.now(Clock.systemDefaultZone());
		System.out.println(localTime3);
		
		LocalTime localTime4=LocalTime.now(Clock.system(ZoneId.of("Indian/Cocos")));
		System.out.println(localTime4);
		

		LocalTime localTime5=LocalTime.of(8, 8, 8);
		LocalTime localTime6=LocalTime.of(1, 5, 8);
		LocalTime localTime7=LocalTime.of(11, 5, 8);
		
		if(localTime2.equals(localTime5)) {
			System.out.println("Same time zone");
		}else {
			System.out.println("Not Same time zone");
		}
		if(localTime2.isBefore(localTime7)) {
			System.out.println("Before");
		}
		if(localTime2.isBefore(localTime6)) {
			System.out.println("After");
		}
		
			/* LocalTime Methods to convert String to LocalTime in java */
		LocalTime  localTime8=LocalTime.parse("09:10:10", DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println(localTime8);
	    // hour-of-day (0-23)
		LocalTime localTime9=LocalTime.parse("22:45:30", DateTimeFormatter.ofPattern("HH:mm:ss"));
		System.out.println(localTime9);
		// clock-hour-of-am-pm (1-24)
		LocalTime localTime10=LocalTime.parse("22:45:30", DateTimeFormatter.ofPattern("kk:mm:ss"));
		System.out.println(localTime10);
		  // clock-hour-of-am-pm (1-12)
		LocalTime localTime11=LocalTime.parse("10:45:30 PM", DateTimeFormatter.ofPattern("hh:mm:ss a"));
		System.out.println(localTime11);
		 // hour-of-am-pm (0-11)
		LocalTime localTime12=LocalTime.parse("10:45:30 AM", DateTimeFormatter.ofPattern("KK:mm:ss a"));
		System.out.println(localTime12);
		
		/*LocalTime Methods to convert LocalTime to String in java*/
		
		LocalTime localTime13=LocalTime.now();
		DateTimeFormatter formatter=DateTimeFormatter.ISO_TIME;
		System.out.println(localTime13.format(formatter));
		
		DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(localTime13.format(formatter1));
		
		DateTimeFormatter formatter2=DateTimeFormatter.ofPattern("kk:mm:ss");
		System.out.println(localTime13.format(formatter2));
		
		DateTimeFormatter formatter3=DateTimeFormatter.ofPattern("hh:mm:ss a");
		System.out.println(localTime13.format(formatter3));
		
		DateTimeFormatter formatter4=DateTimeFormatter.ofPattern("KK:mm:ss a");
		System.out.println(localTime13.format(formatter4));
	}
		public static void main(String[] args) {
			dateCreataion() ;

		}
}
