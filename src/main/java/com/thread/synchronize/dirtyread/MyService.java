package com.thread.synchronize.dirtyread;

public class MyService {

	/*
	 * ��Ȼ�÷�����synchronize���Σ����������Ƕ��myservice���󣬶������������˲�����ʵ��ͬ��
	public synchronized MyOneList addServiceMethod(MyOneList list, String data) {
		try{ 
			if(list.getSize() < 1) {
				Thread.sleep(2000);//ģ���Զ������2s��ȡ����
				list.add(data);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return list;
	}
	*/

	/*list�ǵ������󣬹ʶԸö������synchronize���Է�ֹ���*/
	public MyOneList addServiceMethod(MyOneList list, String data) {
		try{ 
			synchronized(list) {
				if(list.getSize() < 1) {
					Thread.sleep(2000);//ģ���Զ������2s��ȡ����
					list.add(data);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return list;
	}
}
