package com.dasari.thread.synchronization.multiplelocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
	private Random random = new Random();
	private Object object1=new Object(); 
	private Object object2=new Object(); 
	List<Integer> list1 = new ArrayList<>();
	List<Integer> list2 = new ArrayList<>();

	public  void  addListOne() {
		synchronized (object1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));
		}
	}

	public  void addListTwo() {
		synchronized (object2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));
		}
	}

	public void workProcess() {
		System.out.println("Started");
		long startTime = System.currentTimeMillis();
		Thread thread=new Thread(()->{
			doingWork();
		});
		
		Thread thread2=new Thread(()->{
			doingWork();
		});
		thread.start();
		thread2.start();
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("List1:"+list1.size());
		System.out.println("List2:"+list2.size());
		long endTime = System.currentTimeMillis();
		System.out.println("Completed");
		System.out.println("End time:" + (endTime - startTime));
	}

	public void doingWork() {
		for (int i = 0; i < 1000; i++) {
			addListOne();
			addListTwo();
		}
	}
}
