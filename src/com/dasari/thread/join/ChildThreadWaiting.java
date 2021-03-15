package com.dasari.thread.join;

public class ChildThreadWaiting extends Thread {
	static Thread mainThread;

	@Override
	public void run() {
		try {
			mainThread.join();
		} catch (InterruptedException e) {
		}

		for (int i = 0; i < 5; i++) {
			
			System.out.println("Child Thread");
		}
	}
}
