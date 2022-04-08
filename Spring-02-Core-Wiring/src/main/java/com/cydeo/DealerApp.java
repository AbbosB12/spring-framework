package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DealerApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCar.class);

        Car car = container.getBean(Car.class);
        Person person = container.getBean(Person.class);
        Motorcycyle motorcycyle = container.getBean(Motorcycyle.class);

        System.out.println("Person's name : " + person.getName());
        System.out.println("Car's make : " + car.getMake());
        System.out.println("Persons's car : " + person.getCar().getMake());
        System.out.println("Person's motorcycle : " + person.getMotorcycyle().getModel());
    }
}
