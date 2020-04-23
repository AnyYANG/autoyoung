package com.autoyoung.springcloudautoyoungconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @EnableDiscoveryClient开启Spring Cloud的服务注册与发现，由于这里引入了spring-cloud-starter-alibaba-nacos-discovery模块，
 * 所以Spring Cloud Common中定义的那些与服务治理相关的接口将使用Nacos的实现。这点不论我们使用Eureka、Consul还是其他Spring Cloud整合的注册中心都一样，
 * 这也是Spring Cloud做了封装的好处所在，如果对Eureka、Consul这些注册中心的整合还不熟悉的可以看看以前的这篇：
 * Spring Cloud构建微服务架构：服务注册与发现（Eureka、Consul）。
 */
@SpringBootApplication
@EnableDiscoveryClient(autoRegister = true)
@EnableFeignClients
public class SpringCloudAutoyoungServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAutoyoungServiceApplication.class, args);
    }

}
