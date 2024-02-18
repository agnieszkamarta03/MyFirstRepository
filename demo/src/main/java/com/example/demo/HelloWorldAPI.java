package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController						//to display data in a browser
public class HelloWorldAPI {

	@GetMapping("/hello") 		//localhost:port/hello
	public String sayHelloWorld() {
		return "hello world";
	}
}