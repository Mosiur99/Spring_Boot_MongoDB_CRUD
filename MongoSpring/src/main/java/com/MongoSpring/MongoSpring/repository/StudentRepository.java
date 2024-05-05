package com.MongoSpring.MongoSpring.repository;

import com.MongoSpring.MongoSpring.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer> {


}
