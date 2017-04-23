package com.thread.stopthread;

/**
 * 通过stop方式中断线程：
 * 缺点：暴力中断，并且以后该方法会不再使用，强烈不建议使用
 * 
 * 通过break方式中断线程：
 * 缺点：不能彻底停掉线程，break只能把循环中断，但线程依旧会往下执行
 * 
 * 通过return方式中断线程：
 * 优点：能够彻底停止线程。
 * 缺点：return对原有业务代码造成污染，不便进行更好的流程控制。
 * 
 * 通过throw exception方式中断线程：
 * 优点：能够彻底停掉线程，鼓励使用该种方式。
 * */
public class BreakMyThread extends Thread {

	public void run() {
		for(int i = 0; i < 500000; i++) {
			if(this.interrupted()) {
				System.out.println("线程即将通过break方式停止！");
				break;
			}
			System.out.println("i = " + (i + 1));
		}
		System.out.println("线程并未停止，使用break方式会造成假的中断！");
	}
}
