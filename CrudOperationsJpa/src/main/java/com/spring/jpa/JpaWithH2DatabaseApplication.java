package com.spring.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaWithH2DatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaWithH2DatabaseApplication.class, args);
	}

}
