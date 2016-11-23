package com.geekymv.aop.annotation;

import org.springframework.stereotype.Service;

@Service("helloLog")
public class HelloLogImpl implements HelloLog {
	
	@Log
	public void helloLog() {
		System.out.println("has log");
	}

	public void helloWorld() {
		System.out.println("no log");
	}
}
