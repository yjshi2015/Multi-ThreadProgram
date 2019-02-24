package com.thread.stopthread;

public class BreakStopThreadTest {

	public static void main(String[] args) {
		try {
			BreakMyThread myThread = new BreakMyThread();
			myThread.start();
			Thread.sleep(2000);//main线程休眠2s
			myThread.interrupt();//中断myThread线程
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("all thread end !");
	}
}
