package com.example.arvores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class ArvoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArvoresApplication.class, args);
	}
	
	@Bean
	@ConditionalOnMissingBean
	public InternalResourceViewResolver defaultViewResolver() {  
	    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	    resolver.setPrefix("/WEB-INF/jsp/");
	    resolver.setSuffix(".jsp");
	    
	    return resolver;
	}

}
