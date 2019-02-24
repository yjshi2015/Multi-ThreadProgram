package com.thread.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * ����һ���ɻ����̳߳أ�����̳߳س��ȳ���������Ҫ���������տ����̣߳����޿ɻ��գ����½��̡߳�
 * �̳߳�Ϊ���޴󣬵�ִ�еڶ�������ʱ��һ�������Ѿ���ɣ��Ḵ��ִ�е�һ��������̣߳�������ÿ���½��̡߳�
 * */
public class ThreadPoolTest {

	public static void main(String[] args) {

		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		final int j = 10;

		for (int i = 0; i < 10; i++) {

			final int index = i;
			try {
				Thread.sleep(index * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			cachedThreadPool.execute(new Runnable() {
				public void run() {
					System.out.println(index);
				}
			});
		}
	}
}