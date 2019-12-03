package com.leam.bootadminclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BootadminclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootadminclientApplication.class, args);
    }

}
