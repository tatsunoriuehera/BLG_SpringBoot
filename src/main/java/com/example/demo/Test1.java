package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1 {
	
	@RequestMapping("/test1")
	public String write1() {
		return "What's spring boot?";

	}
}