package com.geekymv.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-aop-annotation.xml");
		HelloLog helloLog = (HelloLog) context.getBean("helloLog");
		helloLog.helloLog();
		helloLog.helloWorld();
	}

}
