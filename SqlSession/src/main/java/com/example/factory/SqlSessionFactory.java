package com.example.factory;

import com.example.SqlSession;

public interface SqlSessionFactory {
    SqlSession openSession();
}
