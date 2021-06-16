package com.telusko.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.telusko.demo.dao.AlienRepo;
import com.telusko.demo.model.Alien;

@Controller
public class AlienController
{
	@Autowired
	AlienRepo repo;
	
	@Autowired
	ObjectMapper mapper;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		return "home.jsp";
	}
	@RequestMapping("/getDetails")
	public ResponseEntity <String> getDetails()
	{
		String retValue="";
		try {
			retValue=mapper.writeValueAsString(repo.findAll());
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseEntity.ok(retValue) ;
	}
	
	@RequestMapping("/getCalculatedValues/{num1}/{num2}")
	public ResponseEntity <Integer> getCalcs(@PathVariable int num1,  @PathVariable int num2)
	{
		//String retValue="";
		int total=num1+num2;
		return ResponseEntity.ok(total) ;
	}
}
