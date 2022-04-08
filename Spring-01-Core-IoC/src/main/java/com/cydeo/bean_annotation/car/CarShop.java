package com.cydeo.bean_annotation.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarShop {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(CarConfig.class);

        Audi au = container.getBean(Audi.class);
        au.noise();

        BMW bm = container.getBean(BMW.class);
        bm.noise();

        Honda hA = container.getBean(Honda.class);
        hA.noise();

        Lexus lS = container.getBean(Lexus.class);
        lS.noise();

        Porshe pE = container.getBean(Porshe.class);
        pE.noise();

        Tesla tS = container.getBean(Tesla.class);
        tS.noise();

        Toyota toyota = container.getBean(Toyota.class);
        toyota.noise();
    }
}
