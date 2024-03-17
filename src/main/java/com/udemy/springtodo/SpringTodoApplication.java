package com.udemy.springtodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringTodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTodoApplication.class, args);
    }

    // https://kohei.life/spring-boot-build-deploy/

}
