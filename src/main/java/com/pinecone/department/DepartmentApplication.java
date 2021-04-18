package com.pinecone.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
@EnableEurekaClient
public class DepartmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentApplication.class, args);
	}

	@Bean
	public OpenAPI openAPI() {
		return new OpenAPI().info(new Info()
				.title("PineCone Department Service")
				.description("Api documentation for pinecone Department Service")
				.version("v2.0.0").license(new License().name("Apache 2.0")
				.url("http://dev.pinecone.com")));
	}

}
