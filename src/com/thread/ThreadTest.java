package com.thread;

public class ThreadTest {

	public static void main(String[] args) {
		try {
			MyThread myThread = new MyThread();
			myThread.start();
			Thread.sleep(2000);
			System.out.println("main�߳̽���ֹͣ����ʼ����ִ��");
			myThread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
	}
}
