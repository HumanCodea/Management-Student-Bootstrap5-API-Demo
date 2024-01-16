package com.example.ManagementStudentDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.ManagementStudentDemo.model.MyStudent;
import com.example.ManagementStudentDemo.service.MyStudentService;

import java.util.List;

@Controller
@RequestMapping(path = "")
public class MyStudentController {
    
    @Autowired
    private MyStudentService myStudentService;

    @GetMapping("/my_Students")
    public ModelAndView getAllMyStudent(){
        List<MyStudent> list = myStudentService.getAllMyStudent();
        return new ModelAndView("myStudent", "student", list);
    }


}
