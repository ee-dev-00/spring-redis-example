package com.eug.springredisexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringRedisExampleApplication {

	public static void main(String[] args) throws InterruptedException {
		ConfigurableApplicationContext context = SpringApplication.run(SpringRedisExampleApplication.class, args);

		RedisLoadTester tester = context.getBean(RedisLoadTester.class);

		tester.doLoadTest();
	}
}
