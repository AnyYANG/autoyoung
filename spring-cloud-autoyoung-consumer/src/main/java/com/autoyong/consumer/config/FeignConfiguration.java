package com.autoyong.consumer.config;
import com.autoyong.consumer.comsumer.EchoServiceFallback;
import org.springframework.context.annotation.Bean;

public class FeignConfiguration {
    @Bean
    public EchoServiceFallback echoServiceFallback() {
        return new EchoServiceFallback();
    }

}
