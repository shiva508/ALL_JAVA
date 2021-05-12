package com.dasari.thread.synchronization;

import java.util.Scanner;

public class SynchronouseSimullator {
	public static void main(String[] args) {
		Processor processor=new Processor();
		processor.start();
		
		System.out.println("Press return to stop:");
		Scanner scanner=new Scanner(System.in);
		scanner.nextLine();
		processor.changeGoodToGoStatus();
	}
}
