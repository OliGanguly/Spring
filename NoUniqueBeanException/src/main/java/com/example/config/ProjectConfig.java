package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean(name = "Audi")
    Vehicle vehicle1(){
//      Vehicle veh=new Vehicle();
        var veh=new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }
    @Bean(value = "www")
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("W-agen");
        return  veh;
    }
    @Bean
    @Primary
    Vehicle vehicle3(){
        var veh=new  Vehicle();
        veh.setName("hhh");
        return veh;
    }
    @Bean
    String hello(){
        return  "Oli";
    }
    @Bean
    Integer number(){
        return  12;
    }
}
