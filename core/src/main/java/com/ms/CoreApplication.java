package com.ms;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class CoreApplication {

	protected static final Logger log = Logger.getLogger(CoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
		log.info("Generating MicroService...");
	}
	
}
