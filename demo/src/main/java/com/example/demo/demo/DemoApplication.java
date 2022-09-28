package com.example.demo.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@Value( "${myprop}" )
	private String myprop;

	@Value( "${myotherprop:xx}" )
	private String myotherprop;


	@GetMapping("/")
	public String hello() {
		System.out.println("value: " + myprop);
		System.out.println("conditional value: " + myotherprop);		
		return "hello again";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
