package com.example.serviceDiscoveryExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryExampleApplication.class, args);
	}

}
