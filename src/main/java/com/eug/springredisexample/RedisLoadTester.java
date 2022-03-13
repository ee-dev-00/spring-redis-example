package com.eug.springredisexample;

import org.springframework.stereotype.Component;

@Component
public class RedisLoadTester {

    private final RedisTester redisTester;

    public RedisLoadTester(RedisTester redisTester) {
        this.redisTester = redisTester;
    }

    public void doLoadTest() throws InterruptedException {
        System.out.println("Waiting 5 sec before starting a test...");
        Thread.sleep(5000L);
        System.out.println("Starting a load test!");

        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() < (start + 10000)) {

            var value = redisTester.insertOne();
            Student found = redisTester.findOne(value.getId());
            redisTester.deleteById(value.getId());

            Thread.sleep(1);
        }

        System.out.println("Finished test");
    }
}