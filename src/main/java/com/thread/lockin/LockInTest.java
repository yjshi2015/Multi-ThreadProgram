package com.thread.lockin;
/**
 * ������������һ���̵߳õ�һ���������Ժ��ٴ�����˶�����ʱ�ǿ����ٴλ�ȡ��������ġ�
 * 		    ͬ��Ҳ�����ڸ�����̳е�����¡�
 * */
public class LockInTest {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
	}
}
