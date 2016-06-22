package com.ms.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("MICROSERVICE1")
public interface MS1Client extends MS1Interface {
	
	@Override
	@RequestMapping(
			value = "/randomeven", 
			method = RequestMethod.GET, 
			produces = { 
					MediaType.APPLICATION_JSON_VALUE 
			})
	Boolean randomEven();
	
	@Override
	@RequestMapping(
			value = "/random", 
			method = RequestMethod.GET, 
			produces = { 
					MediaType.APPLICATION_JSON_VALUE 
			})
	Integer random();

	@Override
	@RequestMapping(
			value = "/", 
			method = RequestMethod.GET, 
			produces = { 
					MediaType.APPLICATION_JSON_VALUE 
			})
	String home();
}