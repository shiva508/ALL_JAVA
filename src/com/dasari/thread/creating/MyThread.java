package com.dasari.thread.creating;

public class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}

	public static void main(String[] args) {
		MyThread myThread=new MyThread("Shiva");
		myThread.start();
	}

	@Override
	public void run() {
		System.out.println("Executing thread " + Thread.currentThread().getName());
	}
}
