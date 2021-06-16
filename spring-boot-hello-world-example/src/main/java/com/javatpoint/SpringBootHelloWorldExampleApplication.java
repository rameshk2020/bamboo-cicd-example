package com.javatpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
public class SpringBootHelloWorldExampleApplication
{
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootHelloWorldExampleApplication.class, args);
	}
}