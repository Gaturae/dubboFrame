package com.zqcheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zqcheng.service.TestService;


@RestController
@RequestMapping(value = "/test")
public class TestController {

	@Autowired	
	TestService testService;
	
	@RequestMapping
	public void teseController() {
		System.err.println(testService.sayHello());
	}
}