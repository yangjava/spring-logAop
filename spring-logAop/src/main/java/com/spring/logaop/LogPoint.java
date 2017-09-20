package com.spring.logaop;

import org.aspectj.lang.ProceedingJoinPoint;

public interface LogPoint {
     // String className = joinPoint.getTarget().getClass().getName();
	//  Object[] os = joinPoint.getArgs(); 
	void saveLog(ProceedingJoinPoint joinPoint, String methodName, LogAop log);

}
