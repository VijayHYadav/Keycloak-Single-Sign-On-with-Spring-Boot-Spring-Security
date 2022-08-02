package com.vizz.fellowapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.vizz.controllers, com.vizz.service, com.vizz.security, com.vizz.controllers"})
@EntityScan("com.vizz.entity")
@EnableJpaRepositories("com.vizz.repository")
public class FellowAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FellowAppApplication.class, args);
	}

}
