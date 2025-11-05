package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
    Student saveStudent(Student student);
    Student updateStudent(Long id, Student student);
    Student getStudentById(Long id);
    List<Student> getAllStudents();
    void deleteStudent(Long id);
}
