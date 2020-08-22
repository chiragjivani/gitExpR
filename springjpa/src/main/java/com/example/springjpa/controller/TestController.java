package com.example.springjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springjpa.service.CompanyService;
import com.example.springjpa.service.EmployeeService;

@RestController
public class TestController {
	@Autowired
	private CompanyService cs;
	
	@Autowired
	private EmployeeService es;
	
	@GetMapping("/")
	public String test() {
		cs.getCompany();
		return "Hello";
	}

}
