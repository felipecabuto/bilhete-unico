package com.bilheteunico.SPTrans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpTransApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpTransApplication.class, args);
	}

}
