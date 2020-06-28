package com.mqiqe.nacos.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.util.Map;
@Data
@ToString
@RefreshScope
public class UserConfig {

    @Value("${test.name}")
    private String name;
    @Value("${test.age}")
    private int age;

    private Map<String, Object> map;

}
