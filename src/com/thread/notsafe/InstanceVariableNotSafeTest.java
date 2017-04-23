package com.thread.notsafe;
/**
 * 多个线程访问一个类(类有synchronize代码块)的同一个对象，则会创建一个锁，以同步方式执行，互不影响。
 * */
public class InstanceVariableNotSafeTest {

	public static void main(String[] args) {
		InstanceVariableNotSafe instance = new InstanceVariableNotSafe();
		ThreadA athread = new ThreadA(instance);
		ThreadB bthread = new ThreadB(instance);
		athread.start();
		bthread.start();
	}
}
