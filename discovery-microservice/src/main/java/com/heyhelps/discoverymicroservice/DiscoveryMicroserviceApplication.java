package com.heyhelps.discoverymicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryMicroserviceApplication.class, args);
	}
}
