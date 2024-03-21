package com.demo_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {
	@GetMapping(path = "/")
	public String print() {
		return "Hi Sir ! How are you";
	}

}
