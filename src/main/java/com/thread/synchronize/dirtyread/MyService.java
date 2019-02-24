package com.thread.synchronize.dirtyread;

public class MyService {

	/*
	 * 虽然该方法由synchronize修饰，但是由于是多个myservice对象，多个监视器，因此并不能实现同步
	public synchronized MyOneList addServiceMethod(MyOneList list, String data) {
		try{ 
			if(list.getSize() < 1) {
				Thread.sleep(2000);//模拟从远处花费2s获取数据
				list.add(data);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return list;
	}
	*/

	/*list是单个对象，故对该对象进行synchronize可以防止脏读*/
	public MyOneList addServiceMethod(MyOneList list, String data) {
		try{ 
			synchronized(list) {
				if(list.getSize() < 1) {
					Thread.sleep(2000);//模拟从远处花费2s获取数据
					list.add(data);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return list;
	}
}
