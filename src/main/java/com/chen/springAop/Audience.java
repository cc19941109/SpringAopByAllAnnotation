package com.chen.springAop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class Audience {
	
	/**
	 * 在目标方法调用之前执行
	 * @category 
	 * @author chengchen2
	 * @date Jun 12, 2017
	 * @param
	 */
	@Before("execution(* com.chen.springAop.Performance.*(..))")
	public void silenceCellPhones(){
		System.err.println("----------silenceCellPhones---------");
	}
	
	/**
	 * 在目标返回时调用
	 * @category 
	 * @author chengchen2
	 * @date Jun 12, 2017
	 * @param
	 */
	@AfterReturning("execution(* com.chen.springAop.Performance.perform(..))")
	public void applause(){
		System.err.println("-------------applause------------");
	}
	
	/**
	 * 在目标方法抛出异常后调用
	 * @category 
	 * @author chengchen2
	 * @date Jun 12, 2017
	 * @param
	 */
	@AfterThrowing("execution(*  com.chen.springAop.Performance.perform(..))")
	public void demandRefund(){
		System.err.println("-----------demand Refund--------------");
	}
	
}
