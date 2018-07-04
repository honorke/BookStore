package com.software.dao;




import java.util.List;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.software.entity.Admin;
import com.software.entity.BookTitle;
import com.software.entity.Remark;
import com.software.entity.User;

@Repository
public interface Admin_mapper {
	
	@Select("select * from User")
	public List<Admin> select();
	
	@Select("select * from admin where name = #{username}")
	public Admin select_admin_by_name(String username);

	
	
	
	
	
	
	
	

	
	
	

}
