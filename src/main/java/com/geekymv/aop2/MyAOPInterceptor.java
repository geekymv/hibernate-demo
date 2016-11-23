package com.geekymv.aop2;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class MyAOPInterceptor implements MethodBeforeAdvice, AfterReturningAdvice {

	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("before");
		throw new RuntimeException("123");
	}
	
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out.println("after");
	}

}
