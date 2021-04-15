package com.dasari.thread.deadlock;

import java.util.concurrent.locks.Lock;

public class RunnableObserver2 implements Runnable{
	private Lock lock1 = null;
	private Lock lock2 = null;

	public RunnableObserver2(Lock lock1, Lock lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " attempting to lock on Lock2");
		lock2.lock();
		System.out.println(threadName + " attempting to lock on Lock2");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(threadName + " attempting to lock on Lock1");
		lock1.lock();
		System.out.println(threadName + " attempting to lock on Lock1");
		
		System.out.println(threadName + " attempting to unlock on Lock2");
		lock2.unlock();
		System.out.println(threadName + " attempting to unlock on Lock1");
		lock1.unlock();
	}

}
