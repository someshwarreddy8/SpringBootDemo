package com.eclature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eclature.model.Student;

@RestController
public class RestControllerCls {
	
	@Autowired
	private Student student;

	@GetMapping("/")
	public String getHelloWorld() {
		System.out.println(student.addFriends());
		return "Hello World..!";
	}
}
