package com.formacionbdi.spring.app.sede;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class HelenaServicioSedeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelenaServicioSedeApplication.class, args);
	}

}
