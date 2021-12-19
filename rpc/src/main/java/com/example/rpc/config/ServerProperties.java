package com.example.rpc.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("rpc.server")
public class ServerProperties {
    private String host;  //注册中心地址
    private int port;     //注册中心端口
}
