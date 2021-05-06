package com.dasari.thread.executableservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceSimulator {
	public static void main(String[] args) {
		ExecutorService executorService=Executors.newSingleThreadExecutor();
		System.out.println(executorService.isTerminated());
		ExecutorService fixedThreadPool=Executors.newFixedThreadPool(2);
		ExecutorService scheduledPool=Executors.newScheduledThreadPool(10);
		ExecutorService threadpoolexecutor=new ThreadPoolExecutor(10, 110, 5L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
	}
}
