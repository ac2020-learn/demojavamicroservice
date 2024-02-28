package com.demo.java.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/")
    String health() {
      return "Rest Service is up and running";
    }
	
}
