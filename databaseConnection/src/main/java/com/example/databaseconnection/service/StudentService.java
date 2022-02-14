package com.example.databaseconnection.service;

import com.example.databaseconnection.model.Student;

import java.util.List;

public interface StudentService {

    Student save(Student student);

    Student fetchStudentById(int id);


    List<Student> fetchAll();
}
