package com.dasari.oops.overriding;

public class OverRidingSimulator {

	public static void main(String[] args) {
		System.out.println("MARRAGE:");
		Marrage marrage=new Marrage();
		marrage.marrageType();
		System.out.println("LOVE MARRAGE:");
		LoveMarrage loveMarrage=new LoveMarrage();
		loveMarrage.marrageType();
		System.out.println("Over Riding");
		System.out.println(loveMarrage.costOfMarrage());
		//When child class object is assigned to parent class reference 
		Marrage marrage2=new LoveMarrage();
		marrage2.marrageType();
		marrage2.staticIsBoyFamilyAgree();//static method can not be overridden
		//LoveMarrage loveMarrage2=new Marrage();
	}

}
