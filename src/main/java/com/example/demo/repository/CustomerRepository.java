package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.CustomerDto;

public interface CustomerRepository extends JpaRepository<CustomerDto, Integer> {

}
