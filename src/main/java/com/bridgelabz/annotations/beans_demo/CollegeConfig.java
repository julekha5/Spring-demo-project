package com.bridgelabz.annotations.beans_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.bridgelabz.annotations.beans_demo")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {
	
//	@Bean
//	public ITeacher mathTeacherBean() {
//		return new MathTeacher();	
//	}
//	
//	@Bean
//	public Principal principalBean() {
//		return new Principal();
//	}

	// @Bean(name = "colBean")
	// @Bean(name = {"colBean" , "collegeBeananother"}) // we can give multiple name
//	@Bean
//	public College collegeBean() // collegeBean - bean id
//	{
//		// College college = new College(principalBean()); // Using constructor
//		College college = new College();
//		college.setPrincipal(principalBean());
//		college.setTeacher(mathTeacherBean());
//		return college;
//	}
}
