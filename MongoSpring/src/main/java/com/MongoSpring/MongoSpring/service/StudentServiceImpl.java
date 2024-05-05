package com.MongoSpring.MongoSpring.service;

import com.MongoSpring.MongoSpring.entity.Student;
import com.MongoSpring.MongoSpring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void updateStudent(Student student) {
        Student data = studentRepository.findById(student.getRollNumber()).orElse(null);

        if(Objects.nonNull(data)){
            data.setName(student.getName());
            data.setAddress(student.getAddress());
            studentRepository.save(data);
        }
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }
}
