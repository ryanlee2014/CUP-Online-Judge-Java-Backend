package com.cupacm.javabackend.consumer.interceptor;

import com.cupacm.javabackend.common.annotation.Logging;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;

@Configuration
@EnableAspectJAutoProxy
@Aspect
@Order(2)
public class LoggingInterceptor {
    @Around("@annotation(logging)")
    public Object loggingInterceptor(ProceedingJoinPoint joinPoint, Logging logging) {
        return new com.cupacm.javabackend.common.service.LoggingInterceptor().invoke();
    }
}
