package com.thread.dirtyread;
/**
 * �������һ���̶߳�ȡʵ������ʱ����ֵ�Ѿ��������̸߳ı��ˡ�
 * ���԰�getValue��������synchronize�ؼ��֣���ʱ�����̷߳���ͬһ�����󣬾ͻ�ͬ��ִ�С�
 * */
public class DirtyReadTest {

	public static void main(String[] args) {
		try {
			PublicVar publicVar = new PublicVar();
			ThreadA myThread = new ThreadA(publicVar);
			myThread.start();//myThread�̷߳���synchronize�����
			Thread.sleep(200);//��ӡ�Ľ���ܴ�ֵ��Ӱ��
			publicVar.getValue();//main�̷߳��ʷ�synchronize�����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
