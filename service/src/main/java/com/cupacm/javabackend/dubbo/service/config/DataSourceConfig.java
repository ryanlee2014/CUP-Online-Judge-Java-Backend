package com.cupacm.javabackend.dubbo.service.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration
@MapperScan("com.cupacm.javabackend.mapper")
public class DataSourceConfig {
}
