package com.software.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.software.dao.BookTitle_mapper;
import com.software.dao.Cart_mapper;
import com.software.dao.Remark_mapper;

import com.software.entity.BookTitle;
import com.software.entity.Remark;
import com.software.entity.cart;
import com.software.service.BookTitle_service;
import com.software.service.Cart_service;
import com.software.service.Remark_service;


@Service
public class Cart_serviceImpl implements Cart_service {

	@Autowired
	Cart_mapper mapper;
	public List<cart> select() {
		// TODO Auto-generated method stub
		return mapper.select();
	}
	
	
	public List<cart> select_cart_by_name(String name) {
		return mapper.select_cart_by_name(name);
	}


	public cart select_cart_by_id(int id) {
		// TODO Auto-generated method stub
		return mapper.select_cartr_by_id(id);
	}

	




	public void insert_cart(cart u) {
		// TODO Auto-generated method stub
		mapper.insert_cart(u);
		
	}
	
	public void delete_cart(int id) {
		mapper.delete_cart(id);
	}


	

	


	


	
	


	

	

}
