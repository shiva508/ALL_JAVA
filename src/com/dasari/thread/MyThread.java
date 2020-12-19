package com.dasari.thread;

public class MyThread {
	MyThread() {
        System.out.print(" MyThread");
    }
    
    public void run() {
        System.out.print(" bar");
    }
    
    public void run(String s) {
        System.out.print(" baz");
    }
}
