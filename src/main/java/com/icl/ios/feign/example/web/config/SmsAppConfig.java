package com.icl.ios.feign.example.web.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@EnableWebMvc
@EnableFeignClients(basePackages = "com.icl.ios.feign.example.web.client")
@EnableJpaRepositories(basePackages = "com.icl.ios.feign.example.web.repository")
@EntityScan(basePackages = "com.icl.ios.feign.example.web.model")
@ComponentScan("com.icl.ios")
@Import(ClientConfig.class)
public class SmsAppConfig {


    public static void main(String[] args) {
        SpringApplication.run(SmsAppConfig.class, args);
    }

}