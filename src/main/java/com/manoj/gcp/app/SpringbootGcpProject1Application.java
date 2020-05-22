package com.manoj.gcp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootGcpProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGcpProject1Application.class, args);
	}
	
	@GetMapping("/gcp")
	public String message() {
		return "Welcome GCP";
	}

}
