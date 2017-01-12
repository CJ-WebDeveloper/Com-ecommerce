package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entity.Admin;
import com.example.services.AdminServices;

@Controller
public class AdminController {

	@Autowired
	AdminServices services;
	
	@ResponseBody
	@RequestMapping("/")
	public List<Admin> index(){
		
		return services.findAllAdmin();
	}
}
