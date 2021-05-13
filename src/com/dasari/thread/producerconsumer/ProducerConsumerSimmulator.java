package com.dasari.thread.producerconsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerSimmulator {
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			producer();
		});
		Thread thread2 = new Thread(() -> {
			consumer();
		});
		thread.start();
		thread2.start();
	}

	public static void producer() {
		Random random = new Random();
		while (true) {
			try {
				queue.put(random.nextInt(100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void consumer() {
		Random random = new Random();
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (random.nextInt(10) == 0) {
				try {
					Integer data = queue.take();
					System.out.println("Queue taken from:" + data+",Size:"+queue.size());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
