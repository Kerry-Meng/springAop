package com.softtron.springAOP.declareParents;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.softtron"})
@EnableAspectJAutoProxy
public class CarInit {
	
}
