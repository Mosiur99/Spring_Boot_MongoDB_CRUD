package com.MongoSpring.MongoSpring.service;

import com.MongoSpring.MongoSpring.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    void addStudent(Student student);

    List<Student> getStudents();
}
