package com.mqiqe.nacos.controller;

import com.alibaba.cloud.nacos.NacosConfigManager;
import com.mqiqe.nacos.config.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class SampleController {
    @Autowired
    private UserConfig userConfig;

    @Autowired
    private NacosConfigManager nacosConfigManager;

    @Value("${user.name}")
    String userName;

    @Value("${user.age:25}")
    Integer age;

    @RequestMapping("/user")
    public String simple() {
        return "Hello Nacos Config!" + "Hello " + userName + " " + age + " [UserConfig]: "
                + userConfig + "!" + nacosConfigManager.getConfigService();
    }

    @RequestMapping("/bool")
    public boolean bool() {
        return (Boolean) (userConfig.getMap().get("2"));
    }
}
