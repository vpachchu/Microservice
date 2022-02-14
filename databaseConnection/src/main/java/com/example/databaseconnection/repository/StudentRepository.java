package com.example.databaseconnection.repository;

import com.example.databaseconnection.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;


public interface StudentRepository extends JpaRepository<Student,Integer> {

    //Student save(Student student);
}
