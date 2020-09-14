package com.springcloud.turbine.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Configuration
@RestController
public class IndexController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${user.username}")
    private String username;
    @Value("${user.password}")
    private String password;

    @GetMapping("/index")
    public Object index() {
        logger.debug("===========debug");
        logger.info("============info");
        logger.warn("============warn");
        logger.error("===========error");
        logger.info("username="+username+",  password="+password);
        return "success";
    }
}