package com.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication   //启用自动配置
//@ComponentScan
@SpringBootApplication  //相当于@SpringBootApplication  @ComponentScan @SpringbootConfiguration 组合使用
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
