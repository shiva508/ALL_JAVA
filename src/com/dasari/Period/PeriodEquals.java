package com.dasari.Period;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodEquals {

	public static void main(String[] args) {
		Period period1=Period.ofDays(90);
		Period period2=Period.between(LocalDate.of(2019, Month.MARCH, 1), LocalDate.now());
		System.out.println(period1.equals(period2));

	}

}
