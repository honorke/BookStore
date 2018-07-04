package com.software.service;

import java.util.List;


import com.software.entity.BookTitle;
import com.software.entity.Remark;
import com.software.entity.User;

public interface User_service {
	public List<User> select();
	
	public User selectUser_by_name(String name);
	
	public void insertUser(User u);
	
	
	public User select_User_by_id(int id);

	

	

}
