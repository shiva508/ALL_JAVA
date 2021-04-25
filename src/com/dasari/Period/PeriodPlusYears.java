package com.dasari.Period;

import java.time.Period;

public class PeriodPlusYears {

	public static void main(String[] args) {
		Period period = Period.ofYears(2);
		Period period1 = period.plusYears(1);
		System.out.println(period1.getYears());

	}

}
