package com.example.ManagementStudentDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ManagementStudentDemo.model.Student;
import com.example.ManagementStudentDemo.respositories.StudentRepository;
import java.util.List;


@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudent(){
       return studentRepository.findAll();
    }

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public void deleteStudent(int id){
        studentRepository.deleteById(id);
    }

    public Student findStudentById(int id){
        return studentRepository.findById(id).get();
    }

}
