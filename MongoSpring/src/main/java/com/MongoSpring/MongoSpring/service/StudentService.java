package com.MongoSpring.MongoSpring.service;

import com.MongoSpring.MongoSpring.entity.Student;

import java.util.List;

public interface StudentService {

    void addStudent(Student student);

    List<Student> getStudents();

    Student getStudent(Integer id);

    Student getStudentByName(String name);

    List<Student> getStudentsByAgeBetween(Integer minAge, Integer maxAge);

    void updateStudent(Student student);

    void deleteStudent(Integer id);
}
