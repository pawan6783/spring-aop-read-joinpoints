package com.example.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class MyDemoAnalyticsAspect {
	
	@Before("com.example.aopdemo.aspect.AopExpressions.forDaoPackageNoGetterSetter()")
	public void performAnalytics() {
		System.out.println("Analytics is performed");
	}
}
