package com.dasari.thread.rk.treads;

public class ThreadBasicSimulator {

	public static void main(String[] args) {
		ProcessorOne processorOne=new ProcessorOne();
		processorOne.start();
		ProcessorTwo processorTwo=new ProcessorTwo();
		Thread threadTwo=new Thread(processorTwo);
		threadTwo.start();
		System.out.println("\n Thread3");
		for(int i=300;i<400;i++) {
			System.out.println("Thread3:"+i);
		}
	}

}
