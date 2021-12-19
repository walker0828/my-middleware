package com.example.rpc.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.Resource;


public class ServerAutoConfiguration implements ApplicationContextAware {
    private Logger logger = LoggerFactory.getLogger(ServerAutoConfiguration.class);

    @Resource
    ServerProperties serverProperties;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
