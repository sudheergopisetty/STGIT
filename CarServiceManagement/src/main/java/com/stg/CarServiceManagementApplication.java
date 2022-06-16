package com.stg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.annotations.SwaggerDefinition;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@SwaggerDefinition
@EnableSwagger2
public class CarServiceManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarServiceManagementApplication.class, args);
	}

}