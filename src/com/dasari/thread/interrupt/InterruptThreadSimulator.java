package com.dasari.thread.interrupt;

public class InterruptThreadSimulator {
	public static void main(String[] args) {
		InterruptThread interruptThread = new InterruptThread();
		interruptThread.start();
		interruptThread.interrupt();
		System.out.println("End of main thread");
	}
}
