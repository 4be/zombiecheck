package com.zombieab.demo.utils;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

@Configuration
public class ConfigHttp {

    @Bean
    RestTemplate restTemplate() {
        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        requestFactory.setReadTimeout(30000);
        return new RestTemplate(requestFactory);
    }
}
