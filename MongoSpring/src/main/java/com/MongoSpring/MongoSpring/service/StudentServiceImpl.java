package com.MongoSpring.MongoSpring.service;

import com.MongoSpring.MongoSpring.entity.Student;
import com.MongoSpring.MongoSpring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

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
    public List<Student> getStudentsByAgeBetween(Integer minAge, Integer maxAge) {
        return studentRepository.getStudentsByAgeBetween(minAge, maxAge);
    }

    @Override
    public void updateStudent(Student student) {
        Student data = studentRepository.findById(student.getRollNumber()).orElse(null);

        if(Objects.nonNull(data)) {
            data.setName(student.getName());
            data.setAddress(student.getAddress());
            data.setAge(student.getAge());
            studentRepository.save(data);
        }
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student getStudentByName(String name) {
        return studentRepository.getStudentByName(name);
    }
}
