package com.example.ManagementStudentDemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name_student")
    private String NameST;
    private String BirthDay;
    private String Classes;
    private String Majors;
    private String JPAs;

    public Student() {
    }

    public Student(String name, String birthDay, String class1, String majors, String jPAs) {
        this.NameST = name;
        this.BirthDay = birthDay;
        this.Classes = class1;
        this.Majors = majors;
        this.JPAs = jPAs;
    }

    
}
