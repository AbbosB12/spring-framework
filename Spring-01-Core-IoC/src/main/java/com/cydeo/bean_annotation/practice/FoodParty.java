package com.cydeo.bean_annotation.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FoodParty {
    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(FoodConfig.class);

        container.getBean(HealthyFood.class).getFood();
        container.getBean("f2",JunkFood.class).getFood();
    }
}
