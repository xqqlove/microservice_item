package com.yiwa.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ItemCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(ItemCoreApplication.class, args);
    }
}
