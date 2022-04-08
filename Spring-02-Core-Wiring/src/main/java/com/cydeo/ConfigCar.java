package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {

    @Bean
    Car car() {
        Car car = new Car();
        car.setMake("Porshe");
        return car;
    }

    @Bean
    Motorcycyle motorcycyle() {
        Motorcycyle motorcycyle = new Motorcycyle();
        motorcycyle.setModel("Yams");
        return motorcycyle;
    }

    //Direct wiring
//@Bean
//    Person person(){
//        Person p = new Person();
//        p.setName("Mike");
//        p.setCar(car());
//        return p;
//    }
//Auto writing
    @Bean
    Person person(Car car, Motorcycyle motorcycyle) {
        Person p = new Person();
        p.setName("Mike");
        p.setCar(car);
        p.setMotorcycyle(motorcycyle);
        return p;
    }
}
