package com.dasari.thread.parallel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelSimulator {
	public static void main(String[] args) {
		Integer a=1;
		Integer b=1;
		new Thread(() -> {
			processTax(a);
		}).start();
		new Thread(()->{
			processTax(b);
		}).start();
		heavilyCalculations();
		
		ExecutorService service=Executors.newFixedThreadPool(4);
		service.submit(()->{
			processTax(a);
		});
		service.submit(()->{
			processTax(b);
		});
	}

	private static void heavilyCalculations() {
		// TODO Auto-generated method stub
		
	}

	private static void processTax(Integer a) {
		// TODO Auto-generated method stub
		
	}
}
