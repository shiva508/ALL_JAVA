package com.dasari.thread.basic;

public class ThreadSimulator {
	public static void main(String[] args) throws InterruptedException {
		CountThread countThread = new CountThread();
		System.out.println("===============================");
		DoNotOverRideRun doNotOverRideRun=new DoNotOverRideRun();
		doNotOverRideRun.start();
		doNotOverRideRun.setName("Shiva");
		System.out.println("Thread Name:"+doNotOverRideRun.getName());
		System.out.println("================================");
		OverRidingRunMethod overRidingRunMethod=new OverRidingRunMethod();
		overRidingRunMethod.start();
		Thread.currentThread().setName("Nithya");
		overRidingRunMethod.run(408);
		System.out.println(Thread.currentThread().getName());
		System.out.println("================================");
		OverRidingStartMethod overRidingStartMethod=new OverRidingStartMethod();
		overRidingStartMethod.start();
		System.out.println("================================");
		CountRunnable countRunnable=new CountRunnable();
		Thread thread=new Thread(countRunnable);
		thread.start();
		Thread.currentThread().setPriority(8);
		System.out.println("PRIORITY:"+Thread.currentThread().getPriority());
		countThread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread:" + i);
		}
		
	}
}
