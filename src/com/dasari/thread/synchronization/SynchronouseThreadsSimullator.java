package com.dasari.thread.synchronization;

public class SynchronouseThreadsSimullator {
	private int numberCount = 0;

	public static void main(String[] args) {
		SynchronouseThreadsSimullator simullator = new SynchronouseThreadsSimullator();
		simullator.countNumbers();
	}

	public synchronized void increament() {
		numberCount++;
	}
	private void countNumbers() {
		Thread thread=new Thread(()->{
			for (int i = 0; i <10000; i++) {
				increament();
			}
		});
		
		Thread thread2=new Thread(()->{
			for (int i = 0; i <10000; i++) {
				increament();
			}
		});
		thread.start();
		thread2.start();
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Number count:"+numberCount);
		
	}
}
