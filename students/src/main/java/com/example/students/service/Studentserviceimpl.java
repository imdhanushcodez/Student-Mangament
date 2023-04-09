package com.example.students.service;

import com.example.students.entity.Student;
import com.example.students.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Studentserviceimpl implements Studentserivceinter{
    private StudentRepository studentRepository;

    public Studentserviceimpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveBy(Student student) {
        return studentRepository.save(student);
    }
}
