package com.dasari.thread.rk.treads;

public class ThreadBasicSimulator {

	public static void main(String[] args) throws InterruptedException {
		
		ProcessorOne processorOne=new ProcessorOne();
		processorOne.setPriority(3);
		processorOne.start();
		
		
		ProcessorTwo processorTwo=new ProcessorTwo();
		Thread threadTwo=new Thread(processorTwo);
		threadTwo.setPriority(10);
		threadTwo.start();
		
		// WAIT UNTILL THREAD1 Completed
		processorOne.join();
		threadTwo.join();
		
		System.out.println("\n Thread3");
		for(int i=300;i<400;i++) {
			System.out.println("Thread3:"+i);
		}
		System.out.println("Thread3: Completed");
	}

}
