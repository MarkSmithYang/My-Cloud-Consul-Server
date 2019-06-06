package com.yb.cloud.consul.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author biaoyang
 */
@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsulServerApplication.class, args);
    }

    @GetMapping("/test")
    public String test() {
        return "测试成功";
    }

}
