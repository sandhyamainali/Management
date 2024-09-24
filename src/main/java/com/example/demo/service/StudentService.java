package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	 Student saveStudent(Student student);
	    List<Student> getAll();
	    Student getById(int id);
	    Student getBystudentname(String studentname);
	    Student getBystudentnamStudent(String studentname);
	    void deleteStudentById(int id);
}
