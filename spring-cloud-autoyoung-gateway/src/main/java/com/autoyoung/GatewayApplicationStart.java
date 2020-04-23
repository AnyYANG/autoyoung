package com.autoyoung;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient(autoRegister = true)
@EnableFeignClients
public class GatewayApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplicationStart.class, args);
    }
}
