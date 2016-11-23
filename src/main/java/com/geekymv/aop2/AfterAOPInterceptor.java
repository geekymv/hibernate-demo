package com.geekymv.aop2;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAOPInterceptor implements AfterReturningAdvice {
	
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out.println("after()--> " + returnValue);
	}
}