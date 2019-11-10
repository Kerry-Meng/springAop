package com.softtron.springAOP.services;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component("userservice")
public class UserService {
	
	public void login() {
		System.out.println("login");
	}
	
	public String register() {
		return "register";
	}
	
	public String getToken() {
//		int i = 1 / 0;
		return UUID.randomUUID().toString();
	}
	
}
