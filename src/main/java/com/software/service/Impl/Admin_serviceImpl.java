package com.software.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.software.dao.BookTitle_mapper;
import com.software.dao.Remark_mapper;
import com.software.dao.Admin_mapper;
import com.software.entity.BookTitle;
import com.software.entity.Remark;
import com.software.entity.Admin;
import com.software.service.BookTitle_service;
import com.software.service.Remark_service;
import com.software.service.Admin_service;

@Service
public class Admin_serviceImpl implements Admin_service {

	@Autowired
	Admin_mapper mapper;
	public List<Admin> select() {
		// TODO Auto-generated method stub
		return mapper.select();
	}
	
	
	public Admin select_admin_by_name(String name) {
		return mapper.select_admin_by_name(name);
	}


	
	


	
	


	

	

}
