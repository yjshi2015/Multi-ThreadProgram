package com.thread.syn_asyn;
/**
 * ע��run�е�ѭ��
 * */
public class MyThreadB extends Thread {

	private MyList list;
	
	public MyThreadB(MyList list) {
		this.list = list;
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			list.add("ThreadB" + (i + 1));
		}
	}
}
