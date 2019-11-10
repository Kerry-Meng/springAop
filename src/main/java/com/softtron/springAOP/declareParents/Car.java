package com.softtron.springAOP.declareParents;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements TCar {
	
	@Override
	public void run() {
		System.out.println("地上跑!");
	}
	
}
