package com.thread.yield;
/**
 * yield�����Ƿ�����ǰ��CPU��Դ����������ʱ�䲻ȷ�������ܸոշ����������ֻ��CPU��Դ��
 * */
public class YieldMyThread extends Thread {

	public void run() {
		long beginTimes = System.currentTimeMillis();
		int count = 0;
		for(int i = 0; i < 50000000; i++) {
//			Thread.yield();//�ó�CUP��Դ
			count = count + (i + 1);
		}
		long endTimes = System.currentTimeMillis();
		System.out.println("ִ�����ܹ���ʱ �� " + (endTimes - beginTimes) + 
				" ���룡" + "count = " + count);
	}
}
