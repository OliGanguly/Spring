package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;

public interface StudentDao {
    //need to add Student object
    public int insert(Student student);
    public int change(Student student);
    public int deleteStudent(int id);
}
