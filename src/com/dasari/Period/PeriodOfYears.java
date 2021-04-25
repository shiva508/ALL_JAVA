package com.dasari.Period;

import java.time.Period;

public class PeriodOfYears {

	public static void main(String[] args) {
		Period period = Period.ofYears(2);
		System.out.println(period);
	      System.out.println(period.getYears()); 

	}

}
