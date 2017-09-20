package com.spring.aop.test;

import org.aspectj.lang.ProceedingJoinPoint;

import com.spring.logaop.LogAop;
import com.spring.logaop.LogPoint;

public class LogPointImpl implements LogPoint{

	@Override
	public void saveLog(ProceedingJoinPoint joinPoint, String methodName,
			LogAop log) {
		System.out.println("--- 插入日志log");
	}

}
