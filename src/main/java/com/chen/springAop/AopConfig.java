package com.chen.springAop;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AopConfig {



	@Autowired
	Performance performance;

	public static void main(String[] args) {
		SpringApplication.run(AopConfig.class, args);
	}

	@PostConstruct
	public void testAudience() {
		performance.perform();
	}

	@Bean
	public Audience audience() {
		return new Audience();

	}
}
