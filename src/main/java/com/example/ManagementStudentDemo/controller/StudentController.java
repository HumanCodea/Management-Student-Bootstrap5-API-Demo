package com.example.ManagementStudentDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.ManagementStudentDemo.model.MyStudent;
import com.example.ManagementStudentDemo.model.Student;
import com.example.ManagementStudentDemo.service.MyStudentService;
import com.example.ManagementStudentDemo.service.StudentService;

import java.util.List;

@Controller
@RequestMapping(path = "")
public class StudentController {

    @Autowired
    private StudentService studentService;
    
    @Autowired
    private MyStudentService myStudentService;

    @GetMapping("/home")
    public String Home(){
        return "home";
    }

    @GetMapping("/available_students")
    public ModelAndView getAllStudent(){
        List<Student> list = studentService.getAllStudent();
        return new ModelAndView("availableStudent","student", list);
    }

    @GetMapping("/student_register")
    public String StudentRegister(){
        return "studentRegister";
    }

    @PostMapping("/save")
    public String StorageStudent(@ModelAttribute Student student){ // thuoc tinh modelAtribute la dung de danh dau day la doi tuong tren html
        studentService.addStudent(student);
        return "redirect:/available_students";
    }

    @RequestMapping("deleteList/{id}")
    public String deleteStudent(@PathVariable("id") int id){
        studentService.deleteStudent(id);
        return "redirect:/available_students";
    }

    @RequestMapping("/editList/{id}")
    public String editStudent(@PathVariable("id") int id, Model model){
        Student student1 = studentService.findStudentById(id);
        model.addAttribute("student", student1); // dung model de day thong tin cu cua student muon sua len html
        return "editStudent";
    }
    
    @RequestMapping("/mylist/{id}")
    public String addToMyStudent(@PathVariable("id") int id){
        Student student = studentService.findStudentById(id);
        MyStudent myStudent = new MyStudent(student.getId(), student.getNameST(), student.getBirthDay(), student.getClasses(), student.getMajors(), student.getJPAs());
        myStudentService.addToMyStudent(myStudent);
        return "redirect:/my_Students"; // redirect:/ -- tai lai trang theo url
    }

    @RequestMapping("/deleteMyList/{id}")
    public String deleteMyStudent(@PathVariable("id") int id){
        myStudentService.deleteById(id);
        return "redirect:/my_Students";
    }


}
