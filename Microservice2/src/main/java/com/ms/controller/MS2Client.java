package com.ms.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("MICROSERVICE2")
public interface MS2Client extends MS2Interface {

	@Override
	@RequestMapping(
			value = "/even/{value}",
            method = RequestMethod.GET,
            produces = {
                    MediaType.APPLICATION_JSON_VALUE
            })
	Boolean even(@PathVariable("value") Integer value);

}