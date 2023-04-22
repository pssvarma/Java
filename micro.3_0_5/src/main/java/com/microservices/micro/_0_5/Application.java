package com.microservices.micro._0_5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan("com.microservices.micro.rest")
@ComponentScan("com.microservices.micro.swagger")

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
