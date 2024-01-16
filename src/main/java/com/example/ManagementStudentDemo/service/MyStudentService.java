package com.example.ManagementStudentDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ManagementStudentDemo.model.MyStudent;
import com.example.ManagementStudentDemo.respositories.MyStudentRepository;

@Service
public class MyStudentService {
    
    @Autowired
    private MyStudentRepository myStudentRepository;

    public List<MyStudent> getAllMyStudent(){
        return myStudentRepository.findAll();
    }

    public void addToMyStudent(MyStudent myStudent){
        myStudentRepository.save(myStudent);
    }

    public void deleteById(int id){
        myStudentRepository.deleteById(id);
    }
}
