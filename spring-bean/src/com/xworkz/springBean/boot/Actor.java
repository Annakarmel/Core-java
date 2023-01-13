package com.xworkz.springBean.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
	
	private String name;
	private String lang;
	private int age;
	
	public Actor(@Value("Yash") String name, @Value("Kannad")  String lang, @Value("30") int age) {
		this.name = name;
		this.lang = lang;
		this.age = age;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getLang() {
		return lang;
	}

}
