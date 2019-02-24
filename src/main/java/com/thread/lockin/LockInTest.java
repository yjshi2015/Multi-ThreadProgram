package com.thread.lockin;
/**
 * 可重入锁：当一个线程得到一个对象锁以后，再次请求此对象锁时是可以再次获取对象的锁的。
 * 		    同样也适用于父子类继承的情况下。
 * */
public class LockInTest {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
	}
}
