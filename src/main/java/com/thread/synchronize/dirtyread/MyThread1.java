package com.thread.synchronize.dirtyread;

public class MyThread1 extends Thread {

	private MyOneList list;
	
	public MyThread1(MyOneList list) {
		this.list = list;
	}
	
	public void run() {
		MyService myService = new MyService();
		myService.addServiceMethod(list, "A");
	}
}
