package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class SbmsRestSwaggerTestApp01Application {

	public static void main(String[] args) {
		SpringApplication.run(SbmsRestSwaggerTestApp01Application.class, args);
	}

}
