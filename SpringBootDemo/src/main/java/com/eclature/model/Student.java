package com.eclature.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("${my.name}")
	String name;
	
	List<String> frnds;
	
	@PostConstruct //life cycle annotation. It gets called as soon as Student bean is created.
	public List<String> init() {
		frnds = new ArrayList<String>();
		frnds.add("abc");
		frnds.add("xyz");
		frnds.add("lmn");
		frnds.add("qur");
		
		return frnds;
	}
	
	public List<String> addFriends() {
		
		frnds.add("yuvi");
		return frnds;
	}

	public String getStudent() {
		return "This is Student Bean";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
