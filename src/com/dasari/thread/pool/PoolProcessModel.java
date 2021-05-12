package com.dasari.thread.pool;

public class PoolProcessModel implements Runnable {
	private int id;

	public PoolProcessModel(int id) {
		this.id = id;
	}

	public void run() {
		System.out.println("Starting " + id);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ending " + id);
	}

}
