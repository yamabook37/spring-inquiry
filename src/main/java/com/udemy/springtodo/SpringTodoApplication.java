package com.udemy.springtodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTodoApplication {

    // jarを使用, 修正のたびにmaven packageしてあげる必要がある

    public static void main(String[] args) {
        SpringApplication.run(SpringTodoApplication.class, args);
    }

}
