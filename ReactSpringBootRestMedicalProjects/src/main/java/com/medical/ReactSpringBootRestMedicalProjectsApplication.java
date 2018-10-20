package com.medical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.medical.service.LoginService;

@SpringBootApplication()
public class ReactSpringBootRestMedicalProjectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactSpringBootRestMedicalProjectsApplication.class, args);
	}
	
}
