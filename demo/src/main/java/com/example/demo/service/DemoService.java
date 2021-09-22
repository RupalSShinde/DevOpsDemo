package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dao.Demo;

@Service
public class DemoService {
	
	public Demo getData() {
		return new Demo("Rupal","Shinde");
	}

}
