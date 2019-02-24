package com.thread.notsafe;

public class ThreadA extends Thread {

	private InstanceVariableNotSafe notSafe;
	
	public ThreadA(InstanceVariableNotSafe noSafe) {
		this.notSafe = noSafe;
	}
	
	public void run() {
		notSafe.addI("a");
	}
}
