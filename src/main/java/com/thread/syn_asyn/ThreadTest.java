package com.thread.syn_asyn;
/**
 * ͬ��������еĴ�����ͬ����ӡ�ģ���ִ�С��͡��˳����ǳɶԶ����ֵģ�
 * ���߳�a��b���첽ִ�еģ�ע���߳��е�run������
 * 
 * */
public class ThreadTest {

	public static void main(String[] args) {
		MyList list = new MyList();
		MyThreadA a = new MyThreadA(list);
		a.setName("A");
		a.start();
		
		MyThreadB b = new MyThreadB(list);
		b.setName("B");
		b.start();
	}
}
