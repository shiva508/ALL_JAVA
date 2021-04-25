package com.dasari.Period;

import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodGet {
	public static void main(String[] args) {
		Period period = Period.of(10,5,2);
		System.out.println(period.get(ChronoUnit.DAYS));
		System.out.println(period.get(ChronoUnit.MONTHS));
		System.out.println(period.get(ChronoUnit.YEARS));
	}
}
