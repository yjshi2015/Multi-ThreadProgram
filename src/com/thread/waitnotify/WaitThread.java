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
						+ " 开始执行 " + System.currentTimeMillis());
				object.wait();
				System.out.println("threadName = " + Thread.currentThread().getName()
						+ " 结束执行 " + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
