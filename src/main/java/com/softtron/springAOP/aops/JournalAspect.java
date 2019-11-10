package com.softtron.springAOP.aops;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class JournalAspect {
	
	@Pointcut("execution(* com.softtron.springAOP.services.*.*(..))")
	public void commonPointCut() {
		
	}
	
	@Before("commonPointCut()")
	public void before(JoinPoint joinPoint) {
		System.out.println("before");
		System.out.println("洗菜之前，进行洗手");
		System.out.println(joinPoint.getTarget().getClass().getName());
		System.out.println(joinPoint.getSignature().getName() + "方法");
	}
	
	@After("commonPointCut()")
	public void after(JoinPoint joinPoint) {
		System.out.println("after");
		System.out.println("洗菜之后，开始做饭");
		System.out.println(joinPoint.getTarget().getClass().getName());
		System.out.println(joinPoint.getSignature().getName() + "方法");
	}
	
	public void afterReturn(JoinPoint jointPoint, Object value) {
		System.out.println("after");
		System.out.println("洗菜之后，开始做饭");
		System.out.println(jointPoint.getTarget().getClass().getName());
		System.out.println(jointPoint.getSignature().getName() + "方法");
		System.out.println("获取返回值" + value);
	}
	
	public void exception(JoinPoint jointPoint, Object value) {
		System.out.println("after");
		System.out.println("洗菜之后，开始做饭");
		System.out.println(jointPoint.getTarget().getClass().getName());
		System.out.println(jointPoint.getSignature().getName() + "方法");
		System.out.println("获取返回值" + value);
	}
	
	@Around("commonPointCut()")
	public Object around(ProceedingJoinPoint point) {
		Object object = null;
		try {
			System.out.println(point.getTarget().getClass().getName());
			System.out.println(point.getSignature().getName() + "方法");
			object = point.proceed();// 执行方法
		} catch (Exception e) {
			System.out.println(e);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("返回值" + object);
		return object;
	}
	
}
