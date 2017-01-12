package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.entity.Admin;
import com.example.services.AdminServices;

@Controller
public class AdminController {

	@Autowired
	AdminServices services;
	//Select * From Admin;
	@ResponseBody
	@RequestMapping("/")
	public List<Admin> index(){
		
		return services.findAllAdmin();
	}
	//Select * From Admin where id=id
	@ResponseBody
	@RequestMapping(value="/searchId",method=RequestMethod.GET)
	public List<Admin> searchId(@RequestParam(value="id")int id){
		
		return services.searchId(id);
		
		
	}
	@ResponseBody
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public List<Admin> update(@RequestParam(value="id")int id){
		if(id==1){
			for(Admin admin:services.searchId(id)){
			admin.setUsername("starjune");
			admin.setPassword("123456");
			admin.setTel(1234567890);
			services.update(admin);
				}
			}else if(id==2){
			for(Admin admin:services.searchId(id)){
			admin.setUsername("Jagteerapong");
			admin.setPassword("0123456");
			admin.setTel(0987654321);
			services.update(admin);
				}
			}
		return services.findAllAdmin();
		
		
	}
}
