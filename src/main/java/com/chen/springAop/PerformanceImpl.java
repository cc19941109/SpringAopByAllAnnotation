package com.chen.springAop;

import org.springframework.stereotype.Component;

@Component
public class PerformanceImpl implements Performance{

	@Override
	public void perform() {
		System.err.println(getClass().getName()+"   -------perform------");
	}
	
}
