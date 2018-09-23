package com.medical.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class ReactSpringBootRestMedicalProjectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactSpringBootRestMedicalProjectsApplication.class, args);
	}
}
