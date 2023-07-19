package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {

        //Initialize IOC container
//        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Vehicle veh = context.getBean(Vehicle.class);
//        System.out.println("Vehile Bean : "+veh.getName());
//        String hello = context.getBean(String.class);
//        System.out.println("String bean : "+ hello);
//        int num = context.getBean(Integer.class);
//        System.out.println("Interger Bean : "+num);
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle v = context.getBean(Vehicle.class);
        v.setName("BMW");
        System.out.println(v.getName());
        v.display();



    }
}
