package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {
	@Autowired
//	private service.StudentServiceImpl studentService;
	  private StudentService studentService;
@GetMapping("/")
public String index() {
	return "index";
}
@GetMapping("/register")
public String registerForm(Model model) {
	model.addAttribute("student" ,new Student());
	return "register";
}
 @PostMapping("/register")
    public String addUser(@ModelAttribute Student student) {
      studentService.saveStudent(student);
        return "redirect:details";
    }

 @GetMapping("/details")
 public String viewAllUsers(Model model) {
     model.addAttribute("students", studentService.getAll());
     return "details";
 }

@GetMapping("/edit/{id}")
public String showEditForm(@PathVariable int id, Model model) {
Student student = studentService.getById(id);
model.addAttribute("student", student);
return "edit";
}
@PostMapping("/updateuser")
public String updateUser(Student student) {
studentService.saveStudent(student);
return "redirect:details";
}
@GetMapping("/delete/{id}")
public String deleteUser(@PathVariable int id) {
studentService.deleteStudentById(id);
return "redirect:/details";
}

}

