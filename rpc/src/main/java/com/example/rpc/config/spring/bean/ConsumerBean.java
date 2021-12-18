package com.example.rpc.config.spring.bean;

import com.example.rpc.config.ConsumerConfig;
import org.springframework.beans.factory.FactoryBean;

public class ConsumerBean<T> extends ConsumerConfig implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
