package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class TestController {

	 Logger logger=LoggerFactory.getLogger(TestController.class);
	
	@GetMapping("/sayHello")
	public ResponseEntity<String> sayHello() {

		String file_url = "Hello World I am using AWS Service";

			return ResponseEntity.status(HttpStatus.CREATED).body(file_url);
		}
	  
	  
	
	 
	 
	
}
