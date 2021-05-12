package com.dasari.thread.synchronization;

public class Processor extends Thread {
	private volatile boolean isGoodToGo = true;

	@Override
	public void run() {
		while (isGoodToGo) {
			System.out.println("Welcome to lockdown");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void changeGoodToGoStatus() {
		isGoodToGo=false;	
	}

}
