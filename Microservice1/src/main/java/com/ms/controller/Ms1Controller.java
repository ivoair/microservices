package com.ms.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@EnableCircuitBreaker
public class Ms1Controller implements MS1Client {
	
	private static final Logger log = Logger.getLogger(Ms1Controller.class);

	@Autowired
	private MS2Client ms2;
	
	@Override
	@HystrixCommand(fallbackMethod = "randomEvenFallback")
	@RequestMapping("/randomeven")
	public Boolean randomEven() {
		Integer number = this.random();
		log.info("Numero seleccionado " + number.intValue());
		return ms2.even(number);
	}
	
	public Boolean randomEvenFallback() {
		return Boolean.FALSE;
	}
	
	@Override
	@HystrixCommand(fallbackMethod = "randomFallback")
	@RequestMapping("/random")
	public Integer random() {
		int upper = 100;
		int lower = 1;
		return new Integer((int) (Math.random() * (upper - lower)) + lower);
	}
	
	public Integer randomFallback() {
		return 0;
	}
	
	@Override
	@HystrixCommand(fallbackMethod = "homeFallback")
	@RequestMapping("/")
	public String home() {
		return "Hello World!!!";
	}
	
	public String homeFallback() {
		return "Good Bye!!!";
	}
}
