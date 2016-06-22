package com.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
public class Ms1Application extends CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms1Application.class, args);
		log.info("Microservice 1 loading...");
	}
}
