package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CibilController {
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/score")
	public String getScore() {
		
		return "Good Score running in =" + port;
	}

}
