package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    public String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
