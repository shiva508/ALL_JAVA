package com.dasari.thread.reentrantlock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantRunner {

	private int value = 0;

	private Lock lock = new ReentrantLock();
	private Condition cond = lock.newCondition();

	public void increament() {
		for (int i = 0; i < 10000; i++) {
			value++;
		}
		System.out.println(value);
	}

	public void firstThread() throws InterruptedException {
		lock.lock();
		System.out.println("Waiting ....");
		cond.await();
		System.out.println("Woken up!");
		try {
			increament();
		} catch (Exception e) {
		} finally {
			lock.unlock();
		}
	}

	public void secondThread() throws InterruptedException {
		Thread.sleep(1000);
		lock.lock();
		System.out.println("Press the return key!");
		new Scanner(System.in).nextLine();
		System.out.println("Got return key!");
		cond.signal();
		try {
			increament();
		} catch (Exception e) {
		} finally {
			lock.unlock();
		}
	}

	public void finished() {
		System.out.println("value:" + value);
	}
}
