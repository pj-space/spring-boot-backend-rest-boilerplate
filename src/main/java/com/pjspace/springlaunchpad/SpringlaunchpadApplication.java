package com.pjspace.springlaunchpad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
public class SpringlaunchpadApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(SpringlaunchpadApplication.class, args);
	}

}
