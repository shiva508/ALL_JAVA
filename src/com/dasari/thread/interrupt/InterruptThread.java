package com.dasari.thread.interrupt;

public class InterruptThread extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("I'm lazy thread:" + i);

				Thread.sleep(2000);

			}
		} catch (InterruptedException e) {
			System.out.println("Thread got interepted");
		}
	}
}
