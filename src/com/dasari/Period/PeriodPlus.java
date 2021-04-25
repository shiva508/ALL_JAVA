package com.dasari.Period;

import java.time.Period;

public class PeriodPlus {

	public static void main(String[] args) {
		Period period = Period.of(1, 5, 2);
		System.out.println(
				"Years: " + period.getYears() + ", Months: " + period.getMonths() + ", Days: " + period.getDays());
		Period period1 = period.plus(Period.ofDays(5));
		System.out.println(
				"Years: " + period1.getYears() + ", Months: " + period1.getMonths() + ", Days: " + period1.getDays());

	}

}
