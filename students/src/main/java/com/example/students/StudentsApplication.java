package com.example.students;

import com.example.students.entity.Student;
import com.example.students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsApplication implements CommandLineRunner {

    public StudentsApplication(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(StudentsApplication.class, args);
    }
    private final StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
        /*Student s1= new Student(23454L,"dhanush","dhanu","994269");
        studentRepository.save(s1);
         Student s2=new Student(1234L,"priya","dhanupriya","08766");
         studentRepository.save(s2);
        Student s3=new Student(12234L,"priyadhanrshini","dhanupapu","0876906");
        studentRepository.save(s3);*/

    }
}
