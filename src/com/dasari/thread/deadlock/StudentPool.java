package com.dasari.thread.deadlock;

public class StudentPool {
	public static void main(String[] args) {
		Student student=new Student();
		Coach coach=new Coach();
		System.out.println("Execution Started");
		Runnable task1=()->{
			System.out.println("Entered block1");
			synchronized (student) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (coach) {
					System.out.println("Block1");
				}
			}
		};
		
		Runnable task2=()->{
			System.out.println("Entered block2");
			synchronized (coach) {
				synchronized (student) {
					System.out.println("Block2");
				}
			}
		};
		
		new Thread(task1).start();
		new Thread(task2).start();
	}
}
