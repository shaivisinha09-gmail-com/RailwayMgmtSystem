package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;





@SpringBootApplication
@EntityScan(basePackages = {"com.org.model"})
public class RailwayManagmentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(RailwayManagmentSystemApplication.class, args);
	}

}
