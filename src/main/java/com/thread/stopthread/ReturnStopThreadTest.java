package com.thread.stopthread;

public class ReturnStopThreadTest {

	public static void main(String[] args) {
		try {
			ReturnMyThread myThread = new ReturnMyThread();
			myThread.start();
			Thread.sleep(2000);
			myThread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("����main�̵߳�catch��֧");
			e.printStackTrace();
		}
	}
}
