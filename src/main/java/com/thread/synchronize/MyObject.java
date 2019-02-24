package com.thread.synchronize;

public class MyObject {

	public synchronized void methodA() {
		try {
			System.out.println("begin methodA's thread is " + 
					Thread.currentThread().getName());
			Thread.sleep(3000);
			System.out.println("methodA end endTimes = " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB() {
		try {
			System.out.println("begin methodB's thread is " + 
					Thread.currentThread().getName() + 
					"beginTimes = " + System.currentTimeMillis());
			Thread.sleep(3000);
			System.out.println("methodB end !");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
