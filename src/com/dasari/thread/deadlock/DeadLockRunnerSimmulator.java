package com.dasari.thread.deadlock;

public class DeadLockRunnerSimmulator {
	public static void main(String[] args) {
		DeadLockRunner runner = new DeadLockRunner();
		Thread thread0 = new Thread(() -> {
			runner.firstThread();
		});
		Thread thread1 = new Thread(() -> {
			runner.secondThread();
		});
		thread0.start();
		thread1.start();
		
		try {
			thread0.join();
			thread1.join();
			runner.finished();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
