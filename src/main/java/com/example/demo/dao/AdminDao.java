package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.AdminDto;
import com.example.demo.repository.AdminRepository;

@Component
public class AdminDao {
	@Autowired
	AdminRepository adminRepository;

	public String insert(AdminDto adminDto) {
		adminRepository.save(adminDto);
		
		
		return "data inserted";
	
		
	}

}
