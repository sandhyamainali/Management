package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Admin;
@Controller
public class AdminController {
//	@Autowired
//	private service.StudentServiceImpl studentService;
	@GetMapping("/login")
	public String loginForm(Model model) {
		model.addAttribute("user", new Admin());
		return "login";
	}

	@PostMapping("/login")
	public String loginSubmit(Admin user, Model model) {
//		userService.login(user)
		if ("sandhya".equals(user.getUserName())&& "sandhya@123".equals(user.getPassword())) {
			return "redirect:/register";
		}
		model.addAttribute("user", user);
		model.addAttribute("error", "Invalid Username and Password");
	return "login";
	}
}
