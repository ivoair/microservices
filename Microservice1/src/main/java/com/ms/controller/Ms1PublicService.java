package com.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@EnableCircuitBreaker
public class Ms1PublicService implements MS1Interface {
	
	@Autowired
	private MS1Client client;
	 
	@Override
	@HystrixCommand(fallbackMethod = "randomEvenFallback")
	@RequestMapping("/randomeven")
	public Boolean randomEven() {
		return client.randomEven();
	}
	
	public Boolean randomEvenFallback() {
		return Boolean.FALSE;
	}

	@Override
	@HystrixCommand(fallbackMethod = "randomFallback")
	@RequestMapping("/random")
	public Integer random() {
		return client.random();
	}
	
	public Integer randomFallback() {
		return 0;
	}

	@Override
	@HystrixCommand(fallbackMethod = "homeFallback")
	@RequestMapping("/")
	public String home() {
		return client.home();
	}
	
	public String homeFallback() {
		return "Good Bye!!!";
	}

}
