package com.dasari.thread.semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SemaphoreSimmulator {
	public static void main(String[] args) {

		ExecutorService service = Executors.newCachedThreadPool();

		for (int i = 0; i < 200; i++) {
			service.submit(new Runnable() {
				@Override
				public void run() {
					Connection.singleTonInstance().connect();
				}
			});
		}

		service.shutdown();
		try {
			service.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
