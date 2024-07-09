package com.yrainy.order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestConfiguration
 *
 * @author zhanglun
 * @since 2024-07-09
 */
@Configuration
public class RestConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
