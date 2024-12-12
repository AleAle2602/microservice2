package com.microservice.devices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceDevicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDevicesApplication.class, args);
	}

}
