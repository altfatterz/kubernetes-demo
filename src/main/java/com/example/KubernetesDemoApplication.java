package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KubernetesDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KubernetesDemoApplication.class, args);
    }

    @GetMapping("/")
    public String greeting() {
        return "Happy New Year 2019! :)";
    }

}

