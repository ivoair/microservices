package com.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
public class Ms2Application extends CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms2Application.class, args);
		log.info("Microservice 2 loading...");
	}
}
