package com.dasari.thread.creating;

public class MyRunnable implements Runnable {

	public static void main(String[] args) {
		Thread thread = new Thread(new MyRunnable(), "Shiva1S");
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("Executing thread " + Thread.currentThread().getName());

	}

}
