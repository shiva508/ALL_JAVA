package com.dasari.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolSimulator {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(4);
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 5; i++) {
			service.submit(new PoolProcessModel(i));
		}
		long endTime = System.currentTimeMillis();
		
		service.shutdown();
		try {
			service.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("time:" + (endTime - startTime));
	}
}
