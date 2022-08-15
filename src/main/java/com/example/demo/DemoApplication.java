package com.example.demo;

import com.example.demo.service.otherService.Other1;
import com.example.demo.service.otherService.Other1Impl;
import com.example.demo.service.otherService.Other2;
import com.example.demo.service.otherService.Other2Impl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public Other1 other1() {
        return new Other1Impl();
    }

    @Bean
    public Other2 other2(){
        return new Other2Impl(other1());
    }

}
