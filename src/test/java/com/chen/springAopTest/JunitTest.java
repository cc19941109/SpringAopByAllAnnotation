package com.chen.springAopTest;

import javax.annotation.PostConstruct;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chen.springAop.AopConfig;
import com.chen.springAop.Audience;
import com.chen.springAop.Performance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes  = AopConfig.class)
public class JunitTest {
	
	@Autowired
	private Performance performance;
	

	
	@Test
	public void testAudience(){
		performance.perform();
	}
}
