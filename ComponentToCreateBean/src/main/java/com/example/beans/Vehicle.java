package com.example.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @PostConstruct
    public void initialize(){
        this.name="Honda";
    }
  @PreDestroy
    public void BeforeDestroy(){
      System.out.println("Before Destroying...");
  }
 public void display(){
     System.out.println("dispaly Name");
    }
}
