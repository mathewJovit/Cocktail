package com.drinks.cocktails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude={org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
		org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class})
@ComponentScan(basePackages = "com.drinks.cocktails")
public class CoctailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoctailsApplication.class, args);
	}

}
