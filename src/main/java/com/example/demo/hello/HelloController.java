package com.example.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
	public String index() {
		return "Hi I am Index Method";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hi I am hello..!";
	}

}
