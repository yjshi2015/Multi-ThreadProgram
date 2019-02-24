package com.thread.synchronize;
/**
 * 关于synchronize的结论：
 * 1.A线程先持有object对象的Lock锁，B线程可以以异步的方式调用object对象中的非synchronize类型的方法
 * 2.A线程先持有object对象的Lock锁，B线程如果这时候调用object对象中的synchronize类型的方法则需要等
 * 	   待，也就是同步。
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
