package com.cupacm.javabackend.consumer.controller;

import com.cupacm.javabackend.dubbo.api.HelloWorldProvider;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Component
public class HelloController {

    @Reference(check = false, version = "1.0.0")
    private HelloWorldProvider helloWorldProvider;

    @GetMapping("/")
    public Object hello() {
        return helloWorldProvider.add(1, 1);
    }
}
