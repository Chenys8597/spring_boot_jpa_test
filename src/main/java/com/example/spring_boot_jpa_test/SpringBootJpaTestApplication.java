package com.example.spring_boot_jpa_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.spring_boot_jpa_test.dao")
public class SpringBootJpaTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaTestApplication.class, args);
    }

}
