package com.eug.springredisexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringRedisExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringRedisExampleApplication.class, args);

		RedisTester tester = context.getBean(RedisTester.class);

		var value = tester.insertOne();
		Student found = tester.findOne(value.getId());
		System.out.println("Found: " + found);
	}
}
