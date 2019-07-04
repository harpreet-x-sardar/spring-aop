package com.harpreet.aop.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Application.class, args);
		String[] beans = context.getBeanDefinitionNames();
		System.out.println("=========================List all beans==================================");
		Arrays.asList(beans).stream().forEach(x -> System.out.println(x));
		System.out.println("=========================================================================");
	}


}
