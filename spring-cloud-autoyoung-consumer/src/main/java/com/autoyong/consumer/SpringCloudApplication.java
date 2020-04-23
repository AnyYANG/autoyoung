package com.autoyong.consumer;


import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;
import com.autoyong.consumer.util.UrlCleaner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient(autoRegister = true)
@EnableFeignClients
@SpringBootApplication
public class SpringCloudApplication {

    @LoadBalanced
    @Bean
    @SentinelRestTemplate(urlCleanerClass = UrlCleaner.class, urlCleaner = "clean")
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @LoadBalanced
    @Bean
    @SentinelRestTemplate
    public RestTemplate restTemplate1() {
        return new RestTemplate();
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringCloudApplication.class, args);
    }
}
