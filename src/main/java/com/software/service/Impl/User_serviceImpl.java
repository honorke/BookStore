package com.software.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.software.dao.BookTitle_mapper;
import com.software.dao.Remark_mapper;
import com.software.dao.User_mapper;
import com.software.entity.BookTitle;
import com.software.entity.Remark;
import com.software.entity.User;
import com.software.service.BookTitle_service;
import com.software.service.Remark_service;
import com.software.service.User_service;

@Service
public class User_serviceImpl implements User_service {

	@Autowired
	User_mapper mapper;
	public List<User> select() {
		// TODO Auto-generated method stub
		return mapper.select();
	}
	
	
	public User selectUser_by_name(String name) {
		return mapper.selectUser_by_name(name);
	}


	
	


	public  void insertUser(User u) {
		// TODO Auto-generated method stub
		 mapper.insertUser(u);
		
	}


	public User select_User_by_id(int id) {
		// TODO Auto-generated method stub
		return mapper.selectUser_by_id(id);
	}


	
	


	

	

}
