package com.icl.ios.feign.example.web.config;

import com.icl.ios.feign.example.web.client.SmsClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@EnableWebMvc
@EnableFeignClients(basePackages = "com.icl.ios.feign.example.web.client")
@ComponentScan("com.icl.ios")
@EntityScan(basePackages = "com.icl.ios")
public class SmsAppConfig {

    public static void main(String[] args) {
        SpringApplication.run(SmsAppConfig.class, args);
    }
}