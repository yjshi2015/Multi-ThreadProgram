package com.thread.yield;
/**
 * yield作用是放弃当前的CPU资源，但放弃的时间不确定，可能刚刚放弃，立马又获得CPU资源。
 * */
public class YieldMyThread extends Thread {

	public void run() {
		long beginTimes = System.currentTimeMillis();
		int count = 0;
		for(int i = 0; i < 50000000; i++) {
//			Thread.yield();//让出CUP资源
			count = count + (i + 1);
		}
		long endTimes = System.currentTimeMillis();
		System.out.println("执行完总共用时 ： " + (endTimes - beginTimes) + 
				" 毫秒！" + "count = " + count);
	}
}
