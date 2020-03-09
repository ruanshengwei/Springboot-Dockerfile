package com.ruanshengwei.springbootdockerfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerfileApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDockerfileApplication.class, args);
    }

    @GetMapping("test")
    public String test(){
        return "test";
    }

}
