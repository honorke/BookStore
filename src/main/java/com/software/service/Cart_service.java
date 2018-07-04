package com.software.service;

import java.util.List;


import com.software.entity.BookTitle;
import com.software.entity.Remark;
import com.software.entity.cart;

public interface Cart_service {
	public List<cart> select();
	
	
	
	public void insert_cart(cart u);
	
	
	public cart select_cart_by_id(int id);
	
	public List<cart> select_cart_by_name(String name);
	
	public void delete_cart(int id);

	

}
