package com.dasari.thread.semaphores;

import java.util.concurrent.Semaphore;

public class Connection {

	private static Connection INSTANCE = new Connection();
	private int connections = 0;
	private Semaphore semaphore=new Semaphore(10,true);

	private Connection() {
	}

	public static Connection singleTonInstance() {
		return INSTANCE;
	}
	
	public void connect() {
		try {
			semaphore.acquire();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		try {
			doConnect();
		} finally {
			semaphore.release();
		}
	}

	public void doConnect() {
		
		synchronized (this) {
			connections++;
			System.out.println("Current connections:"+connections);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (this) {
			connections--;
		}
		
	}
}
