package com.cydeo.bean_annotation.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class FoodConfig {

    @Bean
    HealthyFood healthyFood() {
        return new HealthyFood();
    }

    @Bean(name = "f1")
    @Primary
    JunkFood junkFood1() {
        return new JunkFood();
    }


    @Bean(name = "f2")
    JunkFood junkFood2() {
        return new JunkFood();
    }
}
