package com.dasari.facebook.assingnment;

public class ChickenCalculaterFactory {

	public static void main(String[] args) {
		Checken checken=new Checken();
		checken.setAge(2)
				.setIDNumber(1)
				.setWeight(4.0);
		chickenPriceCalculator(checken);
	}

	private static void chickenPriceCalculator(Checken checken) {
		Integer chickenAge=checken.getAge();
		Double chickenWeight=checken.getWeight();
		
	}

}
