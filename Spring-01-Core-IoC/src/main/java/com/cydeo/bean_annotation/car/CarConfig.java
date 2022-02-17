package com.cydeo.bean_annotation.car;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {


    @Bean
    Audi audi(){return new Audi();}

    @Bean
    BMW bmw(){ return new BMW();}

    @Bean
    Honda honda(){ return new Honda();}

    @Bean
    Lexus lexus(){return new Lexus();}

    @Bean
    Porshe porshe(){return new Porshe();}

    @Bean
    Tesla tesla(){return new Tesla();}

    @Bean
    Toyota toyota(){return new Toyota();}
}
