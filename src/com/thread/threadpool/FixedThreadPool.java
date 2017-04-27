package com.thread.threadpool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ����һ�������̳߳أ��ɿ����߳���󲢷������������̻߳��ڶ����еȴ���
 * ��Ϊ�̳߳ش�СΪ3��ÿ���������index��sleep 2�룬����ÿ�����ӡ3�����֡�
 * �����̳߳صĴ�С��ø���ϵͳ��Դ�������á���Runtime.getRuntime().availableProcessors()
 * */
public class FixedThreadPool {

	public static void main(String[] args) {
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 10; i++) {
			final int index = i;
			fixedThreadPool.execute(new Runnable() {
				public void run() {
					try {
						System.out.println(index);
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
}
