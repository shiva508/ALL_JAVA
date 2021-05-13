package com.dasari.thread.wait;

import java.util.Scanner;

public class WaitNotifyProcessor {
	public void produce() {
		synchronized (this) {
			try {
				System.out.println("Producer thread running");
				wait();
				System.out.println("Got lock on object again");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void consume() {

		try {
			System.out.println("Please enter text");
			Scanner scanner=new Scanner(System.in);
			
			Thread.sleep(2000);
			synchronized (this) {
				
				System.out.println("Waiting for return key");
				String name = scanner.nextLine();
				System.out.println("Return key passed");
				notify();
				Thread.sleep(5000);
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
