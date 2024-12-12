package com.microservice.permissions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroservicePermissionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicePermissionsApplication.class, args);
	}

}
