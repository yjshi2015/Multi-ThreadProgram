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
 * 
 * */
public class ThrowMyThread extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 500000; i++) {
				if(this.interrupted()) {
					System.out.println("�߳�ͨ��throw exception��ʽ�˳���");
					throw new InterruptedException();
				}
				System.out.println("i = " + (i + 1));
			}
			System.out.println("forѭ���⣬�������߳��жϺ󲻻ᱻִ��");
		}catch (InterruptedException e) {
			System.out.println("����mythread��run������catch��֧");
			e.printStackTrace();
		}
	}
}
