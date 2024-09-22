package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;

import repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	
	 @Autowired
	 private StudentRepository studentRepository;
	
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}
	
	
	
	public List<Student> getAll() {
		
		return studentRepository.findAll();
	}
	
	public Student getById(int id) {
		
		return studentRepository.findById(id).get();
	}
	
	
	public Student getBystudentname(String studentname) {
		
		return studentRepository.findByFname(studentname);

		
	}
public Student getBystudentnamStudent(String studentname) {
		
		return studentRepository.findByLname(studentname);

		
	}
	public void deleteStudentById(int id) {
	    studentRepository.deleteById(id);
	}

}
