package com.example.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Vehicle {
    public String name="Honda";

    @PostConstruct
    public void initializeVehicle(){
        this.name="Honda";
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
