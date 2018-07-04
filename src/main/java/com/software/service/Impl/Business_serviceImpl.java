package com.software.service.Impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.software.dao.BookTitle_mapper;
import com.software.dao.Business_mapper;
import com.software.dao.Remark_mapper;
import com.software.dao.User_mapper;
import com.software.entity.BookTitle;
import com.software.entity.Business;
import com.software.entity.Remark;
import com.software.entity.User;
import com.software.service.BookTitle_service;
import com.software.service.Business_service;
import com.software.service.Remark_service;
import com.software.service.User_service;
import com.software.utils.User_state;

@Service
public class Business_serviceImpl implements Business_service {

	@Autowired
	Business_mapper mapper;

	public List<Business> select() {
		// TODO Auto-generated method stub
		return mapper.select();
	}

	public Business select_business_by_name(String name) {
		// TODO Auto-generated method stub
		return mapper.select_business_by_name(name);
	}

	public void insert_business(Business u) {
		// TODO Auto-generated method stub
		mapper.insert_business(u);
		
	}

	public Business select_business_by_id(int id) {
		// TODO Auto-generated method stub
		return mapper.select_business_by_id(id);
	}

	public List<Business> select_state(User_state state) {
		// TODO Auto-generated method stub
		return mapper.select_state(state);
	}

	public void delete_business_id(int id) {
		// TODO Auto-generated method stub
		mapper.delete_business_id(id);
		
	}

	public List<Business> select_state_no(int no) {
		// TODO Auto-generated method stub
		return mapper.select_state_no(no);
	}

	public void update_business_id(int id) {
		// TODO Auto-generated method stub
		mapper.update_business_id(id);
		
	}

	
	


	

	

}
