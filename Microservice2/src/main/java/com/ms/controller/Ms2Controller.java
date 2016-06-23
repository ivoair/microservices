package com.ms.controller;

import org.apache.log4j.Logger;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@EnableCircuitBreaker
public class Ms2Controller implements MS2Client {

	private static final Logger log = Logger.getLogger(Ms2Controller.class);

	@Override
	@HystrixCommand(fallbackMethod = "evenFallback")
	@RequestMapping("/even/{value}")
    public Boolean even(@PathVariable("value") Integer value) {

		log.info(value.intValue() + (((value.intValue() % 2) == 0)?" es par!!!":" es impar!!!"));
    	return (value.intValue() % 2) == 0;
    }

	public Boolean evenFallback(Integer value) {
		return Boolean.FALSE;
	}
	
}
