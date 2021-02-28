package com.dasari.thread.join;

public class JoinThreadExample extends Thread {
	public int processingCount = 0;

	public JoinThreadExample(int processingCount) {
		this.processingCount = processingCount;
		System.out.println("Thread Created");
	}

	@Override
	public void run() {
		System.out.println("Thread " + this.getName() + " started");
		while (processingCount > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread " + this.getName() + " interrupted");
			}
			processingCount--;
		}
		System.out.println("Thread " + this.getName() + " exiting");
	}

	public static void main(String[] args) throws InterruptedException {
		JoinThreadExample threadExample = new JoinThreadExample(1);
		JoinThreadExample threadExample1 = new JoinThreadExample(10);
		threadExample.start();
		threadExample1.start();
		System.out.println("Invoking join");
		threadExample.join();
		threadExample.join(1000);
		System.out.println("Returned from join");
		System.out.println(threadExample.isAlive());
	}
}



