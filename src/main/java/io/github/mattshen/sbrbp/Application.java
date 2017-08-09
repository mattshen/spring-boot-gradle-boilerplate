package io.github.mattshen.sbrbp;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.WebApplicationInitializer;

@Configuration
@ComponentScan({
	"io.github.mattshen.sbrbp.services",
	"io.github.mattshen.sbrbp.controller"
})
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer implements WebApplicationInitializer {
	
	private static final Logger	LOG	= Logger.getLogger(Application.class);
	
	@Autowired
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}