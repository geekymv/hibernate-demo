package com.geekymv.aop.annotation;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 切面Bean
 * @desc: hibernate-demo
 * @author: miying
 * @createTime: 2016年11月18日 下午7:12:05
 * @history:
 * @version: v1.0
 */
@Aspect
@Component
public class LogAspect {

	/**
	 * 定义切入点
	 */
	@Pointcut("@annotation(com.geekymv.aop.annotation.Log)")
	public void doAspect() {
	}

	@Before("doAspect()")
	public void doBefore(JoinPoint joinPoint) {
		System.out.println("do before");
	}
	
	@After("doAspect()")
	public void doAfter(JoinPoint pjp) {	
		Object[] args = pjp.getArgs();
		MethodSignature signature = (MethodSignature) pjp.getSignature();
		
		Method method = signature.getMethod();
		
		method.isAnnotationPresent(Log.class);
		
		System.out.println("do after");
	}

}
