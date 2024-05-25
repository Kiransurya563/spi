package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.AdminDto;

public interface AdminRepository extends JpaRepository<AdminDto, String>{

}
