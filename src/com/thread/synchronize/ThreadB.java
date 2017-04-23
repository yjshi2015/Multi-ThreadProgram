package com.thread.synchronize;

public class ThreadB extends Thread {

	private MyObject object;
	
	public ThreadB(MyObject object) {
		this.object = object;
	}
	
	public void run() {
		object.methodB();
	}
}
