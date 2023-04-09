package com.example.students.controller;

import com.example.students.entity.Student;
import com.example.students.service.Studentserivceinter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Studentcontroller {
    private Studentserivceinter studentserivceinter;

    public Studentcontroller(Studentserivceinter studentserivceinter) {
        this.studentserivceinter = studentserivceinter;
    }
    @GetMapping("/students")
    public String listStudent(Model model)
    {
            model.addAttribute("students",studentserivceinter.getAllStudent());
            return "students";
    }
    @GetMapping("/delete")
    public String createStudentform(Model model)
    {
        Student s1 = new Student();
        model.addAttribute("student",s1);
        return "createstudent";
    }
    @PostMapping("/products")
    public String saveStudents(@ModelAttribute("student") Student student)
    {
           studentserivceinter.saveBy(student);
           return "redirect:/students";
    }
}
