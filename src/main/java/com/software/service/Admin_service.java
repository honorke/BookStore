package com.software.service;

import java.util.List;



import com.software.entity.Admin;

public interface Admin_service {
	public List<Admin> select();
	
	public Admin select_admin_by_name(String name);
	
	

	

	

}
