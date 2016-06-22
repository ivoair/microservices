package com.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@EnableCircuitBreaker
public class Ms2PublicService implements MS2Interface {
	
	@Autowired
	private MS2Client client;
	 
	@Override
	@HystrixCommand(fallbackMethod = "evenFallback")
	@RequestMapping("/even/{value}")
	public Boolean even(@PathVariable("value") Integer value) {
		return client.even(value);
	}
	
	public Boolean evenFallback() {
		return Boolean.FALSE;
	}
	
}
