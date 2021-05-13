package com.dasari.thread.wait;

public class WaitNotifyProcessorSimulator {
	public static void main(String[] args) {
		final WaitNotifyProcessor notifyProcessor=new WaitNotifyProcessor();
		Thread thread=new Thread(()->{
			notifyProcessor.produce();
		});
		Thread thread1=new Thread(()->{
			notifyProcessor.consume();
		});
		thread.start();
		thread1.start();
		try {
			thread.join();
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
