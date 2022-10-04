package com.example.demo.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@SpringBootApplication
@RestController
public class DemoApplication {

	private static final Logger LOG = LoggerFactory.getLogger(DemoApplication.class);

	@Value( "${message:default}" )
	private String message;

	@Operation(summary = "Get hello message")
	@ApiResponses(value = { 
  	@ApiResponse(responseCode = "200", description = "Ok hello message")})
	@GetMapping("/")
	public String hello() {			
		LOG.info("hello info level");
		LOG.trace("hello trace level");
		LOG.error("hello error level");
		return "hello from: " + message;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
