package com.fight.consumeropenfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerOpenfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerOpenfeignApplication.class, args);
    }

}
