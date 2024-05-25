package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.AdminDto;
import com.example.demo.service.AdminService;

@Controller
public class Admincontroller {
	@Autowired
	AdminService adminService;

	@GetMapping("/register")
	public String adminsignup() {
		return "register";
	}

	@PostMapping("/register")
	@ResponseBody
	public String AdminInsert(@ModelAttribute AdminDto adminDto) {
		adminService.insert(adminDto);
		return "data inserted";

	}

}
