package com.example.databaseconnection.controller;

import com.example.databaseconnection.model.Student;
import com.example.databaseconnection.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

@Autowired
    StudentService studentService;

@RequestMapping(value = "/student",method = RequestMethod.POST)
public Student save(@RequestBody Student student){
    return studentService.save(student);
}

@RequestMapping(value="/student",method = RequestMethod.GET)
public ResponseEntity<Student> fetchById(@RequestParam int id)
{
    Student student=studentService.fetchStudentById(id);
    if(student==null)
    {
       return ResponseEntity.notFound().build();
    }
    else
    {
        return ResponseEntity.ok().body(student);
    }
}

@RequestMapping(value = "/fetchAll", method = RequestMethod.GET)
    public List<Student> fetchAll()
    {
        return  studentService.fetchAll();
    }
}

