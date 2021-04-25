package com.dasari.date;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantExample {

	public static void main(String[] args) {
		Instant inst = Instant.parse("2017-02-03T10:37:30.00Z");  
	    System.out.println(inst); 
	    
	    Instant instant=Instant.now();
	    System.out.println(instant);
	    
	    Instant instant2=instant.minus(Duration.ofDays(100));
	    System.out.println(instant2);
	    
	    Instant instant3=instant2.plus(Duration.ofDays(100));
	    System.out.println(instant3);
	    System.out.println(inst.isSupported(ChronoUnit.DAYS));
	    System.out.println(inst.isSupported(ChronoUnit.YEARS));
	}
}
