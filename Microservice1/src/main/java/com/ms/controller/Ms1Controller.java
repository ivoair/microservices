package com.ms.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ms1Controller implements MS1Interface {
	
	private static final Logger log = Logger.getLogger(Ms1Controller.class);

	@Autowired
	private MS2Client ms2;
	
	@Override
	@RequestMapping("/randomeven")
	public Boolean randomEven() {
		Integer number = this.random();
		log.info("Numero seleccionado " + number.intValue());
		return ms2.even(number);
	}
	
	@Override
	@RequestMapping("/random")
	public Integer random() {
		int upper = 100;
		int lower = 1;
		return new Integer((int) (Math.random() * (upper - lower)) + lower);
	}
	
	@Override
	@RequestMapping("/")
	public String home() {
		return "Hello World!!!";
	}
}
