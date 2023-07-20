package com.spring.jdbc.main;

import com.spring.jdbc.config.ProjectConfig;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Test{
    public static void main(String[] args)  throws SQLException {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        StudentDaoImpl obj = context.getBean(StudentDaoImpl.class);
        Student s=new Student();
//        s.setId(111);
//        s.setName("payel");
//        s.setCity("kolkate");
//        obj.change(s);
        obj.deleteStudent(111);



//      System.out.println(jd.getDataSource().getConnection());
//        String sql="insert into Student(id,name,city) values(?,?,?)";
//        int i=jd.update(sql,2,"Sonnet","Toronto");
//        System.out.println("Successfully Inserted :"+i);

//        String sql="update Student set name=? , city=? where id=?";
//        jd.update(sql,"Titly","Kolkata",111);

//        String sql="Delete from Student where id=?";
//        jd.update(sql,2);

//        String sql="select * from Student";
//        RowMapper rowMapper=new RowMapper() {
//            @Override
//            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//                return null;
//            }
//        }
//
//        jd.queryForObject(sql,rowMapper,1);


    }
}
