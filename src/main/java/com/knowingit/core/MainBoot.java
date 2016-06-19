package com.knowingit.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@EnableAutoConfiguration
@SpringBootApplication
public class MainBoot extends SpringBootServletInitializer{

	public static void main(String[] args){
		//System.out.println(new BCryptPasswordEncoder().encode("password"));
		SpringApplication.run(MainBoot.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MainBoot.class);
    }
	
}
