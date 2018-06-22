package com.example.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example.*")
@EntityScan(basePackages = "com.example.model")
//@EnableJpaRepositories(basePackages = "com.qdms.repository")
public class MyFirstBootJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstBootJpaApplication.class, args);
	}
}



