package com.java.method;

public class SubTest extends JavaMethodTest{

	@Override
	public void test1() {
//		super.test1();
		System.out.println("sub");
//		return "sub.test1()";
	}
	
	public String test2() {
		super.test1();
		return "sub.test2";
	}
	
	public static void main(String[] args) {
		SubTest sub = new SubTest();
		sub.test1();
	}
}
