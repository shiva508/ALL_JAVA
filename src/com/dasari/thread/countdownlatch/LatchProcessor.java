package com.dasari.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class LatchProcessor implements Runnable {

	 private CountDownLatch latch;

	public LatchProcessor(CountDownLatch latch) {
		 this.latch = latch;
	}

	@Override
	public void run() {
		 System.out.println("Started.");

	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException ignored) {}
	        latch.countDown();
	}

}
