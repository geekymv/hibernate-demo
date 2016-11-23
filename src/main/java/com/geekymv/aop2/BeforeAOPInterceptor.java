package com.geekymv.aop2;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAOPInterceptor implements MethodBeforeAdvice {
	
	public void before(Method method, Object[] args, Object instance)
			throws Throwable {
		System.out.println("before()" + method.getName());
	}
}