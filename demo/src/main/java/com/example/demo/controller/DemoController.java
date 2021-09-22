package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Demo;
import com.example.demo.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	public DemoService demoService;
	
	@GetMapping("/getData")
	Demo getData() {
		return demoService.getData();
	}
	

}
