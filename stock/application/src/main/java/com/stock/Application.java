package com.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.kafka.annotation.EnableKafka;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableKafka
public class Application {
	public static void main(String [] args) {
		SpringApplication.run(Application.class, args);
	}
}

