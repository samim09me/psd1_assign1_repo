package com.bjitacademy.assignment1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment1Application {

	public static final Logger logger = LoggerFactory.getLogger(Assignment1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Assignment1Application.class, args);
		logger.info("its a continous integration job");
	}

	public void test() {
		System.out.println("Test");
	}

}
