package com.example.springpractice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfiguration {

    private static final String API_NAME = "Spring Practice API";
    private static final String API_VERSION = "1.0.0";
    private static final String API_DESCRIPTION = "Spring Boot 실습용 API입니다.";

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info().title(API_NAME).description(API_DESCRIPTION).version(API_VERSION));
    }
}