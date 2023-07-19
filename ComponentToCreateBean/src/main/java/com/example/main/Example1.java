package com.example.main;

import com.example.beans.Book;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example1 {
    public static void main(String[] args) {


        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle v = context.getBean(Vehicle.class);
        v.setName("BMW");
        System.out.println("Name coming from post construct :" + v.getName());
        v.display();
        context.close();
       // beans from xml
        var context1= new ClassPathXmlApplicationContext("beans.xml");
        Book b=context1.getBean(Book.class);
        System.out.println(b.getName());



    }
}
