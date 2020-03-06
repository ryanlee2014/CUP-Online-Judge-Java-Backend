package com.cupacm.javabackend.dubbo.service.impl;

import org.apache.dubbo.config.annotation.Service;
import com.cupacm.javabackend.dubbo.api.HelloWorldProvider;
import com.cupacm.javabackend.model.Loginlog;
import com.cupacm.javabackend.model.LoginlogExample;
import org.springframework.beans.factory.annotation.Autowired;
import com.cupacm.javabackend.mapper.*;

import java.util.List;

@Service(version = "1.0.0")
public class HelloWorldService implements HelloWorldProvider {

    @Autowired
    private LoginlogMapper loginLogMapper;

    @Override
    public Integer add(Integer numa, Integer numb) {
        System.out.println(numa + " " + numb);
        LoginlogExample example = new LoginlogExample();
        example.createCriteria().andUserIdEqualTo("2016011253");
        List<Loginlog> log = loginLogMapper.selectByExample(example);
        log.forEach(e -> System.out.println(e.getIp()));
        return numa + numb;
    }
}
