package com.example.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Admin;
import com.example.repository.AdminRepository;

@Service
@Transactional
public class AdminServices {

	@Autowired
	private AdminRepository repo;
	
	public List<Admin> findAllAdmin(){
		
		return repo.findAll();
	}
	public List<Admin> searchId(int id){
		return repo.findById(id);
	}
	public void update(Admin admin){
		repo.save(admin);
	}
}
