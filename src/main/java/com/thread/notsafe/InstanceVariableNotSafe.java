package com.thread.notsafe;
/**
 * 实例变量是非线程安全的
 * 方法内部的变量是线程安全的
 * */
public class InstanceVariableNotSafe {
	
	int num = 0;//实例变量，非线程安全
	
	public synchronized void addI(String userName) {
		try {
			if (userName.equals("a")) {
				num = 100;
				System.out.println("a set over!");
				Thread.sleep(2000);
			} else {
				num = 200;
				System.out.println("b set over!");
			}
			System.out.println(userName + " num = " + num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
