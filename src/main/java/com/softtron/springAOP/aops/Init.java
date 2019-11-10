package com.softtron.springAOP.aops;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = { "com.softtron.springAOP" })
@EnableAspectJAutoProxy
public class Init {
	
}
