package com.thread.dirtyread;

public class ThreadA extends Thread {

	private PublicVar publicVar;
	
	public ThreadA(PublicVar publicVar) {
		this.publicVar = publicVar;
	}
	
	public void run() {
		publicVar.setValue("B", "BB");
	}
}
