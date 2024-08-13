package com.org.spring.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages ="com.org.spring")
@EnableAspectJAutoProxy

public class config{
	
}
