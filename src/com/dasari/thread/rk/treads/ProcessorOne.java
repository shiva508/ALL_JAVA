package com.dasari.thread.rk.treads;

public class ProcessorOne extends Thread {
	@Override
	public void run() {
		System.out.println("\n Thread1 kickoff");
		System.out.println("\n Thread1");
		for (int i = 100; i < 200; i++) {
			System.out.println("Thread1:"+i);
		}
		System.out.println("\n Thread1 Completed");
	}
}
