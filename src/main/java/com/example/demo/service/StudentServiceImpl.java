package com.example.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private StudentRepository studentRepository;

    // Encrypt the password and save the student
    @Override
    public Student saveStudent(Student student) {
        // Encrypt the password before saving
        String encodedPassword = passwordEncoder.encode(student.getPassword());
        student.setPassword(encodedPassword);
        
        logger.info("Saving student with encrypted password");
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student getById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student getBystudentname(String studentname) {
        return studentRepository.findByFname(studentname);
    }

    @Override
    public Student getBystudentnamStudent(String studentname) {
        return studentRepository.findByLname(studentname);
    }

    @Override
    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }
}
