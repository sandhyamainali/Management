package com.example.demo.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
//
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
@Controller
public class AdminController {
	private final StudentService studentService;
	private final Logger logger= LoggerFactory.getLogger(AdminController.class);
	@Autowired
	private PasswordEncoder passwordEncoder;
	public AdminController(StudentService studentService) {
		this.studentService= studentService;
	}
//	@Autowired
//	private service.StudentServiceImpl studentService;
	@GetMapping("/login")
	public String loginForm(Model model) {
		model.addAttribute("user", new Admin());
		return "login";
	}

	@PostMapping("/login")
	public String loginSubmit(Admin user, Model model) {
//		Student foundStudent= studentService.findByname(user.getUserName());
		
//		userService.login(user)
		if ("sandhya".equals(user.getUserName())&& "sandhya@123".equals(user.getPassword())) {
			return "redirect:/register";
		}
		model.addAttribute("user", user);
		model.addAttribute("error", "Invalid Username and Password");
	return "login";
	}
}
