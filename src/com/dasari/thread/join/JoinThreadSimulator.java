package com.dasari.thread.join;

public class JoinThreadSimulator {
	public static void main(String[] args) {
		JoinThread joinThread = new JoinThread();
		joinThread.start();
		try {
			joinThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("MAin THREAD");
		}
	}
}
