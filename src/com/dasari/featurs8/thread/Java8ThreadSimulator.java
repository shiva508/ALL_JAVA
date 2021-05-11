package com.dasari.featurs8.thread;

public class Java8ThreadSimulator {

	public static void main(String[] args) {
		System.out.println("Before Java8");
		Thread thread=new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Daee");
			}
		});
		thread.start();
		System.out.println("After Java8");
		Thread thread1=new Thread(()-> {System.out.println("Daee");});
		thread1.start();
	}
}
