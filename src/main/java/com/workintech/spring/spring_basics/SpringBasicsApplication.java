package com.workintech.spring.spring_basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext contexts =SpringApplication.run(SpringBasicsApplication.class, args);
		for(String context:contexts.getBeanDefinitionNames()){

		}
	}
	@Bean
	public String getCity(){
		return "İstanbul";
	}
//	@Bean
//	public String getCity2(){
//		return "veli";
//	}

}
