package com.dasari.thread.basic;

public class OverRidingStartMethod extends Thread {
	@Override
	public void run() {
		System.out.println("Run method");
	}

	@Override
	public synchronized void start() {
		System.out.println("Start");
		//super.start();
	}
}
