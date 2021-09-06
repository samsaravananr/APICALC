package com.example.calc;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JustADemo 
{
	
	@Autowired
	JustADemoPOJO justademopojo;
	
	
	AtomicInteger counter=new AtomicInteger();
	
	@GetMapping("/thanks")
	public JustADemoPOJO JustaDemoMSG(@RequestParam(value = "name")String name)
	{
		justademopojo.setvId(counter.incrementAndGet());
		justademopojo.setvMsg("Welcome Dear Customer "+name);
		
		return justademopojo;
	}
	
	
	@GetMapping("/add/{n1}/{n2}")
	public int addition(@PathVariable int n1, @PathVariable int n2)
	{
		return n1+n2;
	}
	
	
	@GetMapping("/mul/{n1}/{n2}")
	public int multiplication(@PathVariable int n1, @PathVariable int n2)
	{
		return n1*n2;
	}
	

}
