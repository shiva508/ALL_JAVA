package com.dasari.thread.yield;

public class YieldThreadSimulator {
	public static void main(String[] args) {
		YieldThread yieldThread = new YieldThread();
		yieldThread.start();
		for (int i = 0; i < 5; i++) {
		System.out.println("Main Method");	
		}
	}
}
