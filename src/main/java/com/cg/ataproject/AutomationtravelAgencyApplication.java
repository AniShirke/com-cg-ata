package com.cg.ataproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = {"com.cg.ataproject.model","com.cg.ataproject.controller","com.cg.ataproject.service","com.cg.ataproject.repository","com.cg.ataproject.exception"})
@EntityScan("com.cg.ataproject.model")
@EnableJpaRepositories("com.cg.ataproject.repository")

public class AutomationtravelAgencyApplication {

	private static final Logger LOG = LoggerFactory.getLogger(AutomationtravelAgencyApplication.class);
	
	public static void main(String[] args) {
		
		LOG.info("Starting...");
		SpringApplication.run(AutomationtravelAgencyApplication.class, args);
		LOG.info("Started...");
	}

}
