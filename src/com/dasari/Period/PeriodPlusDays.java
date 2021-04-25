package com.dasari.Period;

import java.time.Period;

public class PeriodPlusDays {

	public static void main(String[] args) {
		Period period = Period.ofDays(2);
		Period period1 = period.plusDays(1);
		System.out.println(period1.getDays());

	}

}
