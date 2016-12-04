package com.ondetemjogo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import com.github.vanroy.cloud.dashboard.config.EnableCloudDashboard;

@SpringBootApplication(scanBasePackages = "com.ondetemjogo")
@EnableEurekaServer
@EnableCloudDashboard
@EnableDiscoveryClient
public class EurekaServerApplication {

	public static void main(String[] args) {
		System.setProperty("spring.application.name", "eureka-server");
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
