package com.dasari.Period;

import java.time.Period;

public class PeriodParse {

	public static void main(String[] args) {
		Period period = Period.parse("P1Y2M3D");
	      System.out.println("Years: " + period.getYears() 
	         + ", Months: " + period.getMonths()
	         +", Days: " + period.getDays());  
	}
}
