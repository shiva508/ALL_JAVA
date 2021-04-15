package com.dasari.thread.concarancy;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcarancySimulator {
	static Integer numberOfTicketsLeft = 10;

	public static void main(String[] args) {
		CustomLock customLock=new CustomLock();
		Lock lock=new ReentrantLock();
		new Thread(() -> {
			customLock.lock();
			if (numberOfTicketsLeft > 0) {
				bookTicked();
				numberOfTicketsLeft--;
			}
			customLock.unlock();
		});
		new Thread(() -> {
			customLock.lock();
			if (numberOfTicketsLeft > 0) {
				bookTicked();
				numberOfTicketsLeft--;
			}
			customLock.unlock();
		});
	}

	private static void bookTicked() {

	}
}
