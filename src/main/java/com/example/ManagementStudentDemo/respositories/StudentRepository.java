package com.example.ManagementStudentDemo.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ManagementStudentDemo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
    
}
