package com.example.databaseconnection.service;

import com.example.databaseconnection.model.Student;
import com.example.databaseconnection.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService{
@Autowired
    StudentRepository studentRepository;

    public Student save( Student student) {
        return studentRepository.save(student);
    }


    public Student fetchStudentById(int id)
    {
        Optional<Student> student= studentRepository.findById(id);

        if(student.isPresent())
        {
            return student.get();
        }
        return null;
    }

    public List<Student> fetchAll()
    {
        return studentRepository.findAll();
    }
}
