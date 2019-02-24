package com.thread.synchronize.dirtyread;

public class MyThread2 extends Thread {

	private MyOneList list;
	
	public MyThread2(MyOneList list) {
		this.list = list;
	}
	
	public void run() {
		MyService myService = new MyService();
		myService.addServiceMethod(list, "B");
	}
}
