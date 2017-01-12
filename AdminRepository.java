package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{
	List<Admin> findById(int id);
}
