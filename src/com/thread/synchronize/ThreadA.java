package com.thread.synchronize;

public class ThreadA extends Thread {

	private MyObject object;
	
	public ThreadA(MyObject object) {
		this.object = object;
	}
	
	public void run() {
		object.methodA();
	}
}
