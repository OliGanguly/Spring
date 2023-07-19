package com.example.main;


import com.example.beans.Person;
import com.example.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = ctx.getBean(Person.class);
        System.out.println(person.getVehicle());

    }
}
