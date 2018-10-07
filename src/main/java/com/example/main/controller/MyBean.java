package com.example.main.controller;

import org.springframework.stereotype.Service;

@Service
public class MyBean implements IMyBean {

	@Override
	public void display() {
		System.out.println("I am a bean!");
	}

}
