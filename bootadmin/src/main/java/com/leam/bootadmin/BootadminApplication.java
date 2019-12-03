package com.leam.bootadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import de.codecentric.boot.admin.server.notify.MailNotifier;
import de.codecentric.boot.admin.server.notify.Notifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.开启boot admin 监控
 * 1.以eureka客户端启动
 */
@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class BootadminApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootadminApplication.class, args);
    }

}
