package com.thread.notsafe;
/**
 * ʵ�������Ƿ��̰߳�ȫ��
 * �����ڲ��ı������̰߳�ȫ��
 * */
public class InstanceVariableNotSafe {
	
	int num = 0;//ʵ�����������̰߳�ȫ
	
	public synchronized void addI(String userName) {
		try {
			if (userName.equals("a")) {
				num = 100;
				System.out.println("a set over!");
				Thread.sleep(2000);
			} else {
				num = 200;
				System.out.println("b set over!");
			}
			System.out.println(userName + " num = " + num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
