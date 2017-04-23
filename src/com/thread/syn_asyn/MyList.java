package com.thread.syn_asyn;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	private List list = new ArrayList();
	
	public synchronized void add(String userName) {
		System.out.println("ThreadName = " + Thread.currentThread().getName() 
				+ "执行了add方法");
		list.add(userName);
		System.out.println("ThreadName = " + Thread.currentThread().getName()
				+ "退出了add方法");
	}
}
