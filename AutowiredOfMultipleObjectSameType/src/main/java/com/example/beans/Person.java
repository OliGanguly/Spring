package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    public String name="Oli";
    public Vehicle vehicle;

    //step1 - if we have multiple beans of same type
    //spring will try to autowired based on parameter name

//    @Autowired
//    public Person(Vehicle vehicle2) {
//        this.vehicle = vehicle2;
//    }
    //step2 - if we have multiple beans of same type
    //spring will try to autowired based on parameter name
    //if parameter name not matched then look for bean which has @Primay annotation


//step 3-if @Primary not maintained then look for @Qualifier to match the bean name with spring context bean name

    @Autowired
    public  Person(@Qualifier("vehicle3") Vehicle vehicle){
        this.vehicle=vehicle;
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setName(String name) {
        this.name = name;
    }
}
