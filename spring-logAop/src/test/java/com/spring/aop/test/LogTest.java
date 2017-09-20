package com.spring.aop.test;

import org.springframework.stereotype.Service;

import com.spring.logaop.LogAop;

@Service
public class LogTest {

	@LogAop
	public void testLog(){
		
		System.out.println("日志测试类-----");
		
	}
}
