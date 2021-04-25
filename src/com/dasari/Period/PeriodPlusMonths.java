package com.dasari.Period;

import java.time.Period;

public class PeriodPlusMonths {

	public static void main(String[] args) {
		Period period = Period.ofMonths(2);
		Period period1 = period.plusMonths(1);
		System.out.println(period1.getMonths());
	}

}
