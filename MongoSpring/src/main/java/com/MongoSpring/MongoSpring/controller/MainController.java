package com.MongoSpring.MongoSpring.controller;

import com.MongoSpring.MongoSpring.entity.Student;
import com.MongoSpring.MongoSpring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @GetMapping("/getStudents")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}
