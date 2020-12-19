package com.dasari.thread;

public class SimpleThread extends Thread{

	@Override
	public void run() {
	System.out.println("Current thread:"+currentThread().getName());	
	}
	
	public static void main(String[] args) {
		Thread thread=new SimpleThread();
		thread.setName("THREAD 1");
		Thread thread2=new SimpleThread();
		thread2.setName("THREAD 2");
		thread.start();
		thread2.start();
	}

}
