package com.dasari.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.dasari.thread.runnable.MyRunnable;


public class WithThreadPool {
	private static final int NTHREDS = 10;

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
		for (int i = 0; i < 500; i++) {
			Runnable worker = new MyRunnable(10000000L + i);
			executor.execute(worker);
		}
		executor.shutdown();
		 executor.awaitTermination(1, TimeUnit.MILLISECONDS);
		  System.out.println("Finished all threads");
	}
}
