package com.dasari.thread.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockBasic {
	private Lock lockA = new ReentrantLock();
	private Lock lockB = new ReentrantLock();

	public void processThis() {
		lockA.lock();
		lockB.lock();
		lockA.unlock();
		lockB.unlock();
	}

	public void processThat() {
		lockB.lock();
		lockA.lock();
		lockB.unlock();
		lockA.unlock();
	}
	private  void process() {
		new Thread(this::processThat);
		new Thread(this::processThis);
	}
	public static void main(String[] args) {
		new Thread(()-> {
		}).start();
	}
}
