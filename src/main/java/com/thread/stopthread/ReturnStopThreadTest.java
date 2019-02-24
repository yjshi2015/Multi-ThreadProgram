package com.thread.stopthread;

public class ReturnStopThreadTest {

	public static void main(String[] args) {
		try {
			ReturnMyThread myThread = new ReturnMyThread();
			myThread.start();
			Thread.sleep(2000);
			myThread.interrupt();
		} catch (InterruptedException e) {
			System.out.println("进入main线程的catch分支");
			e.printStackTrace();
		}
	}
}
