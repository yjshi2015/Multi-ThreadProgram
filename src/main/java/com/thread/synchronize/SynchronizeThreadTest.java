package com.thread.synchronize;
/**
 * ����synchronize�Ľ��ۣ�
 * 1.A�߳��ȳ���object�����Lock����B�߳̿������첽�ķ�ʽ����object�����еķ�synchronize���͵ķ���
 * 2.A�߳��ȳ���object�����Lock����B�߳������ʱ�����object�����е�synchronize���͵ķ�������Ҫ��
 * 	   ����Ҳ����ͬ����
 * */
public class SynchronizeThreadTest {

	public static void main(String[] args) {
		MyObject object = new MyObject();
		ThreadA aThread = new ThreadA(object);
		ThreadB bThread = new ThreadB(object);
		aThread.start();
		bThread.start();
	}
}
