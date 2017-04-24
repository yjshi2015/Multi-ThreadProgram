package com.thread.waitnotify;
/**
 * sleep: 可以在任何地方调用，并且在休眠时间结束后自动调起(并不保证肯定能执行)
 * watify:必须在同步代码块/方法中，即必须先获取到对象锁，执行后，释放对象锁，之后的代码也停止执行，等待notify唤醒。
 * 		      等待状态的线程，如果执行interrupt，则会抛出interruptedException
 * notify:必须在同步代码块/方法中，即必须先获取到对象锁，执行后，暂不释放对象锁，而是同步代码块/方法执行完毕后，释放锁。
 * 		     只会唤起一个在等待的线程。
 * */
public class ThreadTest {

	public static void main(String[] args) {
		try {
			Object lock = new Object();
			WaitThread waitThread = new WaitThread(lock);
			waitThread.start();
			Thread.sleep(3000);
			
			NotifyThread notifyThread = new NotifyThread(lock);
			notifyThread.start();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
