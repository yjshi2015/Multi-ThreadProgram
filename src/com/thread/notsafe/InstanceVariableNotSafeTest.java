package com.thread.notsafe;
/**
 * ����̷߳���һ����(����synchronize�����)��ͬһ��������ᴴ��һ��������ͬ����ʽִ�У�����Ӱ�졣
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
