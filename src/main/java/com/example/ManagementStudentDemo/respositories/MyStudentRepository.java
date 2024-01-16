package com.example.ManagementStudentDemo.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ManagementStudentDemo.model.MyStudent;

@Repository
public interface MyStudentRepository extends JpaRepository<MyStudent, Integer>{
    
}
