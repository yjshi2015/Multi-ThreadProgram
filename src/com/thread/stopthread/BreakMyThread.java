package com.thread.stopthread;

/**
 * ͨ��stop��ʽ�ж��̣߳�
 * ȱ�㣺�����жϣ������Ժ�÷����᲻��ʹ�ã�ǿ�Ҳ�����ʹ��
 * 
 * ͨ��break��ʽ�ж��̣߳�
 * ȱ�㣺���ܳ���ͣ���̣߳�breakֻ�ܰ�ѭ���жϣ����߳����ɻ�����ִ��
 * 
 * ͨ��return��ʽ�ж��̣߳�
 * �ŵ㣺�ܹ�����ֹͣ�̡߳�
 * ȱ�㣺return��ԭ��ҵ����������Ⱦ��������и��õ����̿��ơ�
 * 
 * ͨ��throw exception��ʽ�ж��̣߳�
 * �ŵ㣺�ܹ�����ͣ���̣߳�����ʹ�ø��ַ�ʽ��
 * */
public class BreakMyThread extends Thread {

	public void run() {
		for(int i = 0; i < 500000; i++) {
			if(this.interrupted()) {
				System.out.println("�̼߳���ͨ��break��ʽֹͣ��");
				break;
			}
			System.out.println("i = " + (i + 1));
		}
		System.out.println("�̲߳�δֹͣ��ʹ��break��ʽ����ɼٵ��жϣ�");
	}
}
