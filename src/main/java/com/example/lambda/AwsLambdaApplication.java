package com.example.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.example.lambda.controller.HealthCheckController;

@SpringBootApplication
@Import ({HealthCheckController.class})
public class AwsLambdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsLambdaApplication.class, args);
	}
}
