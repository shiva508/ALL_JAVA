package com.dasari.thread;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Current thread:"+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		RunnableThread runnableThread=new RunnableThread();
		Thread thread=new Thread(runnableThread);
		RunnableThread runnableThread2=new RunnableThread();
		Thread thread2=new Thread(runnableThread2);
	}

}
