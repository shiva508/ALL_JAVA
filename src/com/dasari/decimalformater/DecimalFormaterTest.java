package com.dasari.decimalformater;

import java.text.DecimalFormat;

public class DecimalFormaterTest {
	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat("#.00");
		double tes = (double) 10 / (double) 7;
		System.out.println(tes);
		System.out.println(format.format(tes));
		float and = 1.00f;
		System.out.println(and);
	}

}
