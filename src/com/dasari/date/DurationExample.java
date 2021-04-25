package com.dasari.date;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {

	public static void main(String[] args) {
		Duration duration=Duration.between(LocalTime.NOON, LocalTime.MAX);
		System.out.println(duration.get(ChronoUnit.SECONDS));
		
		System.out.println(duration.isNegative());
		
		Duration duration2=Duration.between(LocalTime.MAX, LocalTime.NOON);
		System.out.println(duration2.isNegative());
		
		Duration duration3=duration.minus(duration);
		System.out.println(duration3.getSeconds());
		Duration duration4=duration2.plus(duration2);
		System.out.println(duration4.getSeconds());

	}
}
