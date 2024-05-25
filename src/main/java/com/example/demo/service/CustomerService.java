package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dao.CustomerDao;
import com.example.demo.dto.CustomerDto;

@Service
public class CustomerService {

	@Autowired
	CustomerDao customerDao;

	public void createCustomer(CustomerDto customerDto) {
		customerDao.createCustomer(customerDto);
	}

	public String otpVerfication(CustomerDto customerDto, ModelMap map) {
		CustomerDto dbdto = customerDao.findCustomerById(customerDto.getId());
		if (dbdto.getOtp() == customerDto.getOtp()) {
			map.put("pass", "account created successfully");
			map.put("loginid", "user id for login " + customerDto.getId());
			return "login";
		} else {
			map.put("fail", "please enter proper otp");
			return "enter-otp";
		}
	}

	public String loginValidation(CustomerDto customerDto, ModelMap map) {
		CustomerDto dto = customerDao.findCustomerById(customerDto.getId());
		if (dto != null) {
			if (dto.getPassword() == customerDto.getPassword()) {
				return "homepage";
			} else {
				map.put("fail", "please enter proper password");
				return "login";
			}
		}else
		{
			map.put("no", "account doesnot exist,create new account");
			return "register";
		}
	}
}