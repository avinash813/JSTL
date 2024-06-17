package com.sample.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

//	@GetMapping("/")
//	public String controller1(Map<String, Object> map) {
//		
//		map.put("msg","Welcome Alexa" );
//		map.put("msg2", "Click me");
//		return "home";
//		
//	}
//	
	@GetMapping("/")
	public String controller2(Map<String, Object> map) {
		
		map.put("msg","Click here to see registered courses" );
		return "home";
		
	}
	
	@GetMapping("/courses")
	public String controller3(Map<String, Object> map) {
		
		String[] courses = {"Java", "Spring", "Hibernate" , "DevOps"};
		
		map.put("courses",courses );
		return "courses";
		
	}
	
}
