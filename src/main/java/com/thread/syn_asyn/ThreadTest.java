package com.thread.syn_asyn;
/**
 * 同步代码块中的代码是同步打印的，“执行”和“退出”是成对儿出现的；
 * 但线程a和b是异步执行的，注意线程中的run方法；
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
