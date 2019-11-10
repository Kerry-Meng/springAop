package com.softtron.springAOP.declareParents;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CarAspect {
	
	//value值代表的就是接口中要实现的所有子类，后面默认的实现就是实现接口的具体实现类。
	@DeclareParents(value = "com.softtron.springAOP.declareParents.TCar+", defaultImpl = com.softtron.springAOP.declareParents.Flycar.class)
	private TFlycar flycar;
	
}
