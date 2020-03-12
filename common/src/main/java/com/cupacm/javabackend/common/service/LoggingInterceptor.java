package com.cupacm.javabackend.common.service;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LoggingInterceptor {
    public Object invoke() {
        return null;
    }
 }
