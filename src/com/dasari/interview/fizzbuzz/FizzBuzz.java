package com.dasari.interview.fizzbuzz;

public class FizzBuzz {
public static String[] myAlg= {"1","2","3","4","5","6","7","8","9","10"};
	public static void main(String[] args) {
		Integer in=0;
		in=in+1;
		//System.out.println(in);
		Double d=28.0;
		int i=10;
		System.out.println(change(2.6666));
		System.out.println(change(2.6));
		//System.out.println(28.0/10);
	}
public static double change(double value) {
	String coverterd=String.valueOf(value);
	String array1[]=coverterd.split("\\.");
	CharSequence subpart="";
	String out="";
	if(array1[1].length()>2) {
		subpart=array1[1].subSequence(0, 2);
		out=array1[0]+"."+subpart;
	}else {
		out=String.valueOf(value);
	}
	
	
	return Double.parseDouble(out);
}
	public static void processArray(String [] myAlg) {
		for (int i = 0; i < myAlg.length; i++) {
			
		}
	}
}
