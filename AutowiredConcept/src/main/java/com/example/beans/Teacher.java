package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
    public String name="Ramesh";

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
