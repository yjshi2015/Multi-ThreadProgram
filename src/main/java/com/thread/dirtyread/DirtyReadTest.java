package com.thread.dirtyread;
/**
 * 脏读：当一个线程读取实例变量时，此值已经被其他线程改变了。
 * 可以把getValue方法加上synchronize关键字，这时两个线程访问同一个对象，就会同步执行。
 * */
public class DirtyReadTest {

	public static void main(String[] args) {
		try {
			PublicVar publicVar = new PublicVar();
			ThreadA myThread = new ThreadA(publicVar);
			myThread.start();//myThread线程访问synchronize代码块
			Thread.sleep(200);//打印的结果受此值的影响
			publicVar.getValue();//main线程访问非synchronize代码块
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
