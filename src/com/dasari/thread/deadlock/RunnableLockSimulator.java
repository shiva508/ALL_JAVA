package com.dasari.thread.deadlock;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableLockSimulator {
	public static void main(String[] args) {
		Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock();
		RunnableObserver observer = new RunnableObserver(lock1, lock2);
		RunnableObserver2 observer2 = new RunnableObserver2(lock1, lock2);
		new Thread(observer).start();
		new Thread(observer2).start();
	}
}
