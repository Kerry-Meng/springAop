package com.softtron.springAOP.declareParents;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarTest {
	
	@Test
	public void test() {
		AnnotationConfigApplicationContext aContext = new AnnotationConfigApplicationContext();
		aContext.register(CarInit.class);
		aContext.refresh();
		TCar car = (TCar) aContext.getBean("car");
		car.run();
		TFlycar flycar = (TFlycar) car;
		flycar.fly();
	}
	
}
