package com.jpet_store.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class JpetStoreEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpetStoreEurekaApplication.class, args);
	}

}
