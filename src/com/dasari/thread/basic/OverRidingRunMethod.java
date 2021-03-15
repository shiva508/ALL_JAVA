package com.dasari.thread.basic;

public class OverRidingRunMethod extends Thread {
	@Override
	public void run() {
		System.out.println("No arg run method");
	}
	public void run(int base) {
		System.out.println("arg run method");
	}
}
