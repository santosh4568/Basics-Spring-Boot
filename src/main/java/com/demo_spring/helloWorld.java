package com.demo_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {
	@GetMapping(path = "/")
	public String print() {
		return "Hi Sir ! ";
	}
	@GetMapping(path="/{name}")
	public String printName(@PathVariable String name) {
		return "Hello " + name +" !";
	}
}
