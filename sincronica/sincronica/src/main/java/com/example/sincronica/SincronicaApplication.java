package com.example.sincronica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class SincronicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SincronicaApplication.class, args);
	}

}
