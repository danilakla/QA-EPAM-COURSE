package com.example.demotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestDemotestApplication {

    public static void main(String[] args) {
        SpringApplication.from(DemotestApplication::main).with(TestDemotestApplication.class).run(args);
    }

}
