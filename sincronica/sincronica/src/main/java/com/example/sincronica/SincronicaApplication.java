package com.example.sincronica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class SincronicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SincronicaApplication.class, args);
	}

}
