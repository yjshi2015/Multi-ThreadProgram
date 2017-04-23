package com.thread.notsafe;

public class ThreadB extends Thread {

	private InstanceVariableNotSafe notSafe;
	
	public ThreadB(InstanceVariableNotSafe noSafe) {
		this.notSafe = noSafe;
	}
	
	public void run() {
		notSafe.addI("b");
	}
}
