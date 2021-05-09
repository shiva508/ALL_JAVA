package com.dasari.book.array;

public class HighArrayApp {
	public static void main(String[] args) {
		HighArray highArray=new HighArray(10);
		highArray.setArrayValue(0,77);
		highArray.setArrayValue(1,99);
		highArray.setArrayValue(2,44);
		highArray.setArrayValue(3,55);
		highArray.setArrayValue(4,22);
		highArray.setArrayValue(5,88);
		highArray.setArrayValue(6,11);
		highArray.setArrayValue(7,00);
		highArray.setArrayValue(8,66);
		highArray.setArrayValue(9,33);
		System.out.println("============================");
		System.out.println(highArray.lengthOfArray());
		System.out.println("==================================");
		long searchKey = 616;
		System.out.println(highArray.findArrayValue(searchKey));
		System.out.println("==================================");
		long deleted = 11;
		System.out.println(highArray.deleteArrayValue(deleted));
		System.out.println("==================================");
		highArray.printArray();
		
		
	}
}
