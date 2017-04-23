package com.thread.notsafe;
/**
 * 多个线程访问一个类(类有synchronize代码块)的多个对象，则会创建多个锁，以异步方式执行，互不影响。
 * */

public class InstanceVariableNotSafeTest1 {

	public static void main(String[] args) {
		InstanceVariableNotSafe instance = new InstanceVariableNotSafe();
		InstanceVariableNotSafe instance1 = new InstanceVariableNotSafe();
		ThreadA athread = new ThreadA(instance);
		ThreadB bthread = new ThreadB(instance1);
		athread.start();
		bthread.start();
	}
}
