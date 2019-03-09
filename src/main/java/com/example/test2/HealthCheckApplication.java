package com.example.test2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.test2.model.MyApplication;

@SpringBootApplication
public class HealthCheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCheckApplication.class, args);
	}
}
