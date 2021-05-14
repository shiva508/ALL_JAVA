package com.dasari.thread.reentrantlock;

public class ReentrantRunnerSimmulator {
	public static void main(String[] args) throws Exception {
		final ReentrantRunner reentrantRunner = new ReentrantRunner();

		Thread thread0 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					reentrantRunner.firstThread();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		});
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					reentrantRunner.secondThread();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		});

		
		thread0.start();
		thread1.start();

		thread0.join();
		thread1.join();
		reentrantRunner.finished();

	}

}
