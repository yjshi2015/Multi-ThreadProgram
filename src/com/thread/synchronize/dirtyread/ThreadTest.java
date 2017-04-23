package com.thread.synchronize.dirtyread;
/**
 * synchronized(非this对象 x):
 * 多个线程多个对象出现脏读，虽然MyService方法由synchronize修饰，但可以通过synchronize(list)方式
 * 来防止脏读
 * */
public class ThreadTest {

	public static void main(String[] args) {
		try {
			MyOneList list = new MyOneList();
			MyThread1 myThread1 = new MyThread1(list);
			myThread1.setName("A");
			myThread1.start();

			MyThread2 myThread2 = new MyThread2(list);
			myThread2.setName("B");
			myThread2.start();

			Thread.sleep(6000);
			System.out.println("listSize = " + list.getSize());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
