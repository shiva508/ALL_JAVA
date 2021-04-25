package com.dasari.Period;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodBetween {

	public static void main(String[] args) {
		Period period=Period.between(LocalDate.of(1991, 8, 8), LocalDate.of(2019, 5, 31));
		System.out.println(period);
	}

}
