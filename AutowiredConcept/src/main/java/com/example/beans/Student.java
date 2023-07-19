package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    public String name="Oli";
    public int id=12;

    @Autowired
//    constructor level
    public Student(Teacher teacher) {
        this.teacher = teacher;
    }

    // Field level Autowired
//    @Autowired
    public Teacher teacher;

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

//    @Autowired on setter method
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setName(String name) {
        this.name = name;
    }



}
