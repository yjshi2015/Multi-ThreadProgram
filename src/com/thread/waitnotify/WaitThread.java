package com.thread.waitnotify;

public class WaitThread extends Thread {

	private Object object;
	
	public WaitThread(Object object) {
		this.object = object;
	}
	
	public void run() {
		try {
			synchronized (object) {
				System.out.println("threadName = " + Thread.currentThread().getName()
						+ " ��ʼִ�� " + System.currentTimeMillis());
				object.wait();
				System.out.println("threadName = " + Thread.currentThread().getName()
						+ " ����ִ�� " + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
