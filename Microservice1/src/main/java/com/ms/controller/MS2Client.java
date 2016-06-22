package com.ms.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("MICROSERVICE2")	
public interface MS2Client {

	@RequestMapping(value = "/even/{value}", method = RequestMethod.GET)
	Boolean even(@PathVariable("value") Integer value);

}