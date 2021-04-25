package com.dasari.Period;

import java.time.Period;

public class PeriodGetDays {
public static void main(String[] args) {
	Period period = Period.of(10,5,2);
    System.out.println(period.getDays());
}
}
