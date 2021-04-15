package com.dasari.thread.deadlock;

public class ResolveDeadLockTest {

	public static void main(String[] args) {
		final A a = new A();
		final B b = new B();
		System.out.println("Execution Started");
		Runnable block1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Entered block1");
				synchronized (a) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (b) {
						System.out.println("Block1");
					}
				}

			}
		};
		Runnable block2 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Entered block2");
				synchronized (b) {
					synchronized (a) {
						System.out.println("Block2");
					}
				}
				
			}
			
		};
		
		new Thread(block1).start();
		new Thread(block2).start();
	}

}
