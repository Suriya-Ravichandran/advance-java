package com.livewire.todo.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Createtodo {
	
	 @GetMapping("/")
	    public String home() {
	        return "index";
	    }

	    @GetMapping("/hello")
	    public String sayHello() {
	        return "Hello, World!";
	    }
	
}
