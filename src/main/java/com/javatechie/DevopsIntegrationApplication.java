package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsIntegrationApplication {

    @GetMapping("/message")
    public String message() {
        return "welcome to devops automation";
    }

    @GetMapping("/add")
    public String add(@RequestParam int x, @RequestParam int y) {
        System.out.println("test");
        return String.valueOf(x + y);
    }

    public static void main(String[] args) {
        SpringApplication.run(DevopsIntegrationApplication.class, args);
    }

}
