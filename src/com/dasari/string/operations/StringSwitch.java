package com.dasari.string.operations;

import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		boolean continueTest=false;
		do {
			System.out.println("PLEASE ENTER TEXT:");
			Scanner input1=new Scanner(System.in);
			
		String input=input1.next();
		switch (input) {
		case "A":
			System.out.println("A");
			break;
		case "B":
			System.out.println("B");
			break;
		case "C":
			System.out.println("C");
			break;
		default:
			System.out.println("Default");
			break;
		}
		System.out.println("Do you want continue Y/N:");
		Scanner toContinue=new Scanner(System.in);
		if(toContinue.next().equalsIgnoreCase("Y")) {
			continueTest=true;	
		}else {
			continueTest=false;
		}
		}while(continueTest);
	
	}

}
