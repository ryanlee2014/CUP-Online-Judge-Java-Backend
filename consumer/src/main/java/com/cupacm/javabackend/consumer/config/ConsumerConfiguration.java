package com.cupacm.javabackend.consumer.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDubbo(scanBasePackages = "com.cupacm.javabackend.consumer.controller")
@ComponentScan(value = {"com.cupacm.javabackend.consumer.controller"})
public class ConsumerConfiguration {
}
