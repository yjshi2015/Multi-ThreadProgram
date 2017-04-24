package com.thread.waitnotify;

public class NotifyThread extends Thread {

	private Object object;
	
	public NotifyThread(Object object) {
		this.object = object;
	}
	
	public void run() {
		synchronized (object) {
			System.out.println("ThreadName = " + Thread.currentThread().getName() 
					+ " ��ʼ���� " + System.currentTimeMillis());
			object.notify();
			System.out.println("ThreadName = " + Thread.currentThread().getName() 
					+ " �������� " + System.currentTimeMillis());			
		}
	}
}
