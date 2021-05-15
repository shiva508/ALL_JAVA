package com.dasari.thread.callablefuture;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureSimulator {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		Future<Integer> future = executorService.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				Random random = new Random();
				Integer duriation = random.nextInt(4000);
				if(duriation>2000) {
					throw new IOException("Sleeping too long");
				}
				System.out.println("Started............");
				try {

					Thread.sleep(duriation);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("End");
				return duriation;
			}
		});

		executorService.shutdown();
		try {
			System.out.println("Result:"+future.get());
		} catch (InterruptedException | ExecutionException e) {
			IOException exception=(IOException) e.getCause();
			System.out.println(exception.getMessage());
		}
	}
}
