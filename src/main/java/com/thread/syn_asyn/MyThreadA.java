package com.thread.syn_asyn;
/**
 * ע��run�е�ѭ��
 * */
public class MyThreadA extends Thread {

	private MyList list;
	
	public MyThreadA(MyList list) {
		this.list = list;
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			list.add("ThreadA" + (i + 1));
		}
	}
}
