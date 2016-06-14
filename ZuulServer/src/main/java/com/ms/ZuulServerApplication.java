package com.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableZuulServer
public class ZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServerApplication.class, args);
	}
}
