package com.dasari.thread.producerconsumer;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class LowLevetWaitNotifyProcessor {
	private LinkedList<Integer> list = new LinkedList<>();
	private final Integer LIMIT = 10;
	private Object lock = new Object();

	public void produce() {
		int value = 0;
		while (true) {
			synchronized (lock) {
				while (list.size()==LIMIT) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				list.add(value++);
				lock.notify();
			}

		}
	}

	public void consume() {
		Random random=new Random();
		
		while (true) {
			synchronized (lock) {
				while (list.size()==0) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("List Size:" + list.size());
				int val = list.removeFirst();
				System.out.println("removed value:" + val);
				lock.notify();
			}
			try {
				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
	}
}
