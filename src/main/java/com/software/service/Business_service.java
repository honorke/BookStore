package com.software.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.software.entity.Business;
import com.software.utils.User_state;

public interface Business_service {
	public List<Business> select();
	
	public Business select_business_by_name(String name);
	
	public void insert_business(Business u);
	
	
	public Business select_business_by_id(int id);
	
	public List<Business>select_state(User_state s);
	
	public void delete_business_id(int id);
	
	public List<Business>select_state_no(int no);
	
	public void update_business_id(int id);


	

}
