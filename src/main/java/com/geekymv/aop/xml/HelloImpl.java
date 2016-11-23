package com.geekymv.aop.xml;

public class HelloImpl implements Hello{
	
	public int testA(int a, int b) {
		System.out.println("test A");
		return a + b;
	}

}
