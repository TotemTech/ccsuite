package com.totem.CS.CSuite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.totem.CS")
@SpringBootApplication(exclude=HibernateJpaAutoConfiguration.class )
public class CSuite extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CSuite.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(CSuite.class);
	}

}
