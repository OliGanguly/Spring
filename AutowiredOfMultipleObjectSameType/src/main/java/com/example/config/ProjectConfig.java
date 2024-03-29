package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {

    @Bean
    public Vehicle vehicle1(){
        var veh=new Vehicle();
        veh.setName("Audi");
        return veh;
    }
    @Bean
    public Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Audi 2");
        return veh;
    }
    @Bean
    public Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Audi 3");
        return veh;
    }
}
