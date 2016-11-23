package com.geekymv.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-aop.xml");
		Hello a = (Hello) context.getBean("hello");
		a.testA(1, 2);
	}

}
