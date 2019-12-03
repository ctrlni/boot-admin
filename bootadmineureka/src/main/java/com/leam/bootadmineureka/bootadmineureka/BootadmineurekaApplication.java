package com.leam.bootadmineureka.bootadmineureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * 以eureka服务端启动
 */
@SpringBootApplication
@EnableEurekaServer
public class BootadmineurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootadmineurekaApplication.class, args);
    }

}
