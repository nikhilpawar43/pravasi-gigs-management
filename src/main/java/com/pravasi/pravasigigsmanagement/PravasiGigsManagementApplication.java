package com.pravasi.pravasigigsmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.pravasi")
@EnableFeignClients(basePackages = "com.pravasi.pravasigigsmanagement.resources")
@EnableDiscoveryClient
public class PravasiGigsManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PravasiGigsManagementApplication.class, args);
	}

}
