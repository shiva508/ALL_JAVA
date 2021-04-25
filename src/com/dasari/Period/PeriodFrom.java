package com.dasari.Period;

import java.time.Period;

public class PeriodFrom {

	public static void main(String[] args) {

		Period period = Period.from(Period.of(20, 10, 5));
	      System.out.println(period);
	}
}
