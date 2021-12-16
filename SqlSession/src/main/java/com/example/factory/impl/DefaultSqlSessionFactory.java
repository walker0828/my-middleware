package com.example.factory.impl;

import com.example.DefaultSqlSession;
import com.example.SqlSession;
import com.example.factory.SqlSessionFactory;

public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private final Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(configuration.con,);
    }
}
