package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStarter1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringStarter1Application.class, args);
		System.out.println("Tomcat is running");
	}

}
