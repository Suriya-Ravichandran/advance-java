package com.livewire.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
	
	
	@GetMapping("/")
	public String Hello() {
		return "Hello World";
	}

}
