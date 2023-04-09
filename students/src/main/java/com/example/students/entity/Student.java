package com.example.students.entity;

import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Long id;
    @Column(name="name",nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    @Column(name="email",nullable = false)
    private String email;
    @Column(name = "num",nullable = false)
    private String num;

    public Student(Long id, String name, String email, String num) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.num = num;
    }
    public Student()
    {

    }
}
