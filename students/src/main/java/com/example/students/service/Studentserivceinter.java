package com.example.students.service;

import com.example.students.entity.Student;

import java.util.List;

public interface Studentserivceinter {
    List<Student> getAllStudent();
    Student saveBy(Student student);
}
