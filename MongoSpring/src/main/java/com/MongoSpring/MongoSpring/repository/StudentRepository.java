package com.MongoSpring.MongoSpring.repository;

import com.MongoSpring.MongoSpring.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer> {

    @Query(value = "{'name': ?0}", fields = "{'address':0}")
    Student getStudentByName(String name);

    @Query("{'age': {'$gt': ?0, '$lt': ?1} }")
    List<Student> getStudentsByAgeBetween(Integer minAge, Integer maxAge);
}
