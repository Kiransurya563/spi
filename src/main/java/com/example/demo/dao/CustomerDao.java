package com.example.demo.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.CustomerDto;
import com.example.demo.repository.CustomerRepository;

@Repository
public class CustomerDao {

	@Autowired
	CustomerRepository customerRepository;

	public void createCustomer(CustomerDto customerDto) {
		customerRepository.save(customerDto);
	}

	public CustomerDto findCustomerById(int id) {
		Optional<CustomerDto> odto = customerRepository.findById(id);
		if (odto.isPresent()) {
			return odto.get();
		} else
			return null;
	}
}
