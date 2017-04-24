package com.thread.waitnotify;
/**
 * sleep: �������κεط����ã�����������ʱ��������Զ�����(������֤�϶���ִ��)
 * watify:������ͬ�������/�����У��������Ȼ�ȡ����������ִ�к��ͷŶ�������֮��Ĵ���Ҳִֹͣ�У��ȴ�notify���ѡ�
 * 		      �ȴ�״̬���̣߳����ִ��interrupt������׳�interruptedException
 * notify:������ͬ�������/�����У��������Ȼ�ȡ����������ִ�к��ݲ��ͷŶ�����������ͬ�������/����ִ����Ϻ��ͷ�����
 * 		     ֻ�ỽ��һ���ڵȴ����̡߳�
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
