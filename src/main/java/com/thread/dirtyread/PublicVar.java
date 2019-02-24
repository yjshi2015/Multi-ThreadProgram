package com.thread.dirtyread;

public class PublicVar {

	private String userName = "A";
	private String password = "AA";
	
	public synchronized void setValue(String userName,String password) {
		try {
			this.userName = userName;
			Thread.sleep(5000);
			this.password = password;
			System.out.println("setValue method is executed by " +
					Thread.currentThread().getName() + " ,userName = " +
					userName + ",password = " + password);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void getValue() {
		System.out.println("getValue method is executed by " +
				Thread.currentThread().getName() + " ,userName = " +
				userName + ",password = " + password);
	}
}
