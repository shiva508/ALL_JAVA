package com.dasari.featurs8.lambda;

public class Worker implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			doWork(i);
		}
	}

	private void doWork(int i) {
		System.out.println("Iteration:" + i);
	}

	public static void main(String[] args) {
		Worker worker=new Worker();
		Thread thread=new Thread(worker);
		thread.start();
	}
}
