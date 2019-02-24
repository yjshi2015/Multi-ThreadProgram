package com.thread.yield;

import java.util.Random;

public class YieldThreadTest {

	public static void main(String[] args) {
		YieldMyThread  myThread = new YieldMyThread();
		myThread.start();
		
		for (int i = 0; i < 10; i++) {
			Random random = new Random(10);
			System.out.println("random.nextInt() : " + random.nextInt());			
		}
	}
}
