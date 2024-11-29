package com.example.autoeverapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // 모든 경로에 대해 CORS 설정
                .allowedOrigins("http://localhost:3000")  // 허용할 origin (localhost:3000)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // 허용할 HTTP 메서드
                .allowedHeaders("*")  // 허용할 헤더
                .allowCredentials(true);  // 쿠키와 인증 정보를 포함한 요청 허용
    }
}

