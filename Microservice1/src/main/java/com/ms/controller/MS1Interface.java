package com.ms.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface MS1Interface {
	
	@RequestMapping(
			value = "/randomeven", 
			method = RequestMethod.GET, 
			produces = { 
					MediaType.APPLICATION_JSON_VALUE 
			})
	Boolean randomEven();
	
	@RequestMapping(
			value = "/random", 
			method = RequestMethod.GET, 
			produces = { 
					MediaType.APPLICATION_JSON_VALUE 
			})
	Integer random();

	@RequestMapping(
			value = "/", 
			method = RequestMethod.GET, 
			produces = { 
					MediaType.APPLICATION_JSON_VALUE 
			})
	String home();

}