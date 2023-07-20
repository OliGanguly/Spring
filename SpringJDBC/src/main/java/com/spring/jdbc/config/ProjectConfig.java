package com.spring.jdbc.config;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.spring.jdbc.dao")
public class ProjectConfig {
    @Bean(name = "dataSource")
    public DriverManagerDataSource getDataSource(){
        DriverManagerDataSource dr=new DriverManagerDataSource();
        dr.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dr.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        dr.setUsername("root");
        dr.setPassword("root");
        return dr;
    }
    @Bean(name = "jdbc")
    public JdbcTemplate getJDBCTemplate(){
        JdbcTemplate jdbc=new JdbcTemplate();
        jdbc.setDataSource(getDataSource());
        return jdbc;
    }


}
