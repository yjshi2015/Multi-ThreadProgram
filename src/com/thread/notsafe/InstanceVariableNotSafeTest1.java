package com.thread.notsafe;
/**
 * ����̷߳���һ����(����synchronize�����)�Ķ��������ᴴ������������첽��ʽִ�У�����Ӱ�졣
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
