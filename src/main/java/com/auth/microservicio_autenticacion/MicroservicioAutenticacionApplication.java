package com.auth.microservicio_autenticacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroservicioAutenticacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioAutenticacionApplication.class, args);
	}

}
