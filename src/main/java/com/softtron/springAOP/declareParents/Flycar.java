package com.softtron.springAOP.declareParents;

public class Flycar implements TFlycar {
	
	@Override
	public void fly() {
		System.out.println("天上飞!");
	}
	
}
