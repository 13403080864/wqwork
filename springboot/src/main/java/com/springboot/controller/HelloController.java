package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @author
 * @since 2021-06-24 17:22
 */
@RestController
@RequestMapping("hello")
public class HelloController {
   @Autowired
   private DataSource dataSource;

    @GetMapping("show")
    public String test(){
        return "helloController";
    }
}
