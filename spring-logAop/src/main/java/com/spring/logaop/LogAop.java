package com.spring.logaop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAop {

	/**
	 * 操作描述
	 */
	public String value() default "";
	/**
	 * 操作用户
	 * @return
	 */
	public String operationName() default "";
}
