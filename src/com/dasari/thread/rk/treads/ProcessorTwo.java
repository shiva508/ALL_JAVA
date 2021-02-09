package com.dasari.thread.rk.treads;

public class ProcessorTwo implements Runnable {

	@Override
	public void run() {
		System.out.println("\n Thread2");
		for (int i = 200; i < 300; i++) {
			System.out.println("Thread2:"+i);
		}
		System.out.println("\n Thread1 kickoff");
	}

}
