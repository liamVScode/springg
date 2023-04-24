package com.javatachie.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemo4Application {
    @GetMapping("/message")
    public String message(){
        return "Deloy success!";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringAzureDemo4Application.class, args);
    }

}
