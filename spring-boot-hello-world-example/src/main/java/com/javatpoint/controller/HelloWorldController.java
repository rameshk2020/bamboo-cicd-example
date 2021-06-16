package com.javatpoint.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
//@EnableScheduling
public class HelloWorldController 
{
	

@Autowired
RestTemplate restTemplate;
	
@RequestMapping("/")
public String hello() 
{
return "Hello javaTpoint";
}

@Bean
public RestTemplate restTemplate() {
    return new RestTemplate();
}

	@RequestMapping("/getIntegratedValues")
	//@Scheduled(initialDelay = 1000, fixedRate = 10000)
	public ResponseEntity<String> getEmployees()
	{
	    final String uri = "http://localhost:8888/getDetails";
	 
	    String result = restTemplate.getForObject(uri, String.class);
	    System.out.println(result);
	    return ResponseEntity.ok(result);
	}
	
	@RequestMapping("/getCalValues")
	public ResponseEntity<Integer> getCalcVal()
	{
	    final String uri = "http://localhost:8888/getCalculatedValues/30/40";
	 
	    int result = restTemplate.getForObject(uri, Integer.class);
	    System.out.println(result);
	    return ResponseEntity.ok(result);
	}
}