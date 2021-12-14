package com.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "whitelist")
public class WhiteListProperties {
    private String users;
}
