package com.thread.stopthread;

public class ThrowStopThreadTest {

	public static void main(String[] args) {
		try{
			ThrowMyThread myThread = new ThrowMyThread();
			myThread.start();
			Thread.sleep(2000);
			myThread.interrupt();
		}catch (InterruptedException e) {
			System.out.println("����main����exception��֧");
			e.printStackTrace();
		}
		System.out.println("end !");
	}
}
