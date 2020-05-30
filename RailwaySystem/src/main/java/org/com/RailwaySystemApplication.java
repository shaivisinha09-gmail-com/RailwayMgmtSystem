package org.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.com.model")
public class RailwaySystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(RailwaySystemApplication.class, args);
	}

}
