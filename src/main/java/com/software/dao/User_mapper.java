package com.software.dao;




import java.util.List;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;


import com.software.entity.BookTitle;
import com.software.entity.Remark;
import com.software.entity.User;

@Repository
public interface User_mapper {
	
	@Select("select * from User")
	public List<User> select();
	
	@Select("select * from user where name = #{username}")
	public User selectUser_by_name(String username);

	@Select("select * from user whree id = #{id}")
	public User selectUser_by_id(int id);
	
	
	@Update("update user set  name = #{name}, password = #{password}, address = #{address}, phone = #{phone} where userid = #{userid}")
	public void update_user(User u);
	
	
	
	
	@Insert("insert into user(name,password,address,phone) values(#{name},#{password},#{address},#{phone})")
	public void  insertUser(User u);
	
	
	

}
