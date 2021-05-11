package com.dasari.thread.parellel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TaxCalculator {
	 static int  finalCount=10;

	public static void main(String[] args) {
		Lock queueLock = new ReentrantLock();
		new Thread(new Runnable() {
			public void run() {
				if(finalCount>0) {
					processTax("1",finalCount);	
					finalCount--;
				}	
				
			}

		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				if(finalCount>0) {
					processTax("2",finalCount);
					finalCount--;
				}
				
				
			}

		}).start();
		/* Using java8 */
		new Thread(() -> {
			try {
				queueLock.lock();
				if(finalCount>0) {
					processTax("3",finalCount);	
					finalCount--;
				}	
			}finally {
				queueLock.unlock();
			}
		}).start();
		new Thread(() -> {
			try {
				queueLock.lock();
				if(finalCount>0) {
					processTax("3-1",finalCount);	
					finalCount--;
				}	
			}finally {
				queueLock.unlock();
			}
			
			
			
		}).start();
		ExecutorService ex=Executors.newFixedThreadPool(4);
		ex.submit(()->processTax("4",finalCount));
		ex.submit(()->processTax("5",finalCount));
	}

	private static void processTax(String string,int finalCount) {
		System.out.println("Process: "+string+";finalCount:"+finalCount);
	}

}
