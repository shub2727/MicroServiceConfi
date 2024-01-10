package com.example.com.microServiceProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Userr {

	public static void main(String[] args) {
		SpringApplication.run(Userr.class, args);
	}

}
