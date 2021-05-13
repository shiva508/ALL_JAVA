package com.dasari.thread.producerconsumer;

import com.dasari.thread.wait.WaitNotifyProcessor;

public class LowLevetWaitNotifyProcessorSimmulator {
	public static void main(String[] args) {
		final LowLevetWaitNotifyProcessor notifyProcessor=new LowLevetWaitNotifyProcessor();
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
