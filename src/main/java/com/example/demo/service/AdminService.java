package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AdminDao;
import com.example.demo.dto.AdminDto;

@Service
public class AdminService {
	@Autowired
	AdminDao adminDao;

	public void insert(AdminDto adminDto) {
		adminDao.insert(adminDto);
		// TODO Auto-generated method stub
		
	}

	
}
