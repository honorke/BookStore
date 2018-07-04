package com.software.dao;




import java.util.List;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;


import com.software.entity.BookTitle;
import com.software.entity.Remark;
import com.software.utils.User_state;
import com.software.entity.Business;

@Repository
public interface Business_mapper {
	
	@Select("select * from Business")
	public List<Business> select();
	
	@Select("select * from business where username = #{username} and state = ${state}")
	public List<Business>select_state(User_state state1);
	
	@Select("select * from business where state = #{no}")
	public List<Business>select_state_no(int no);
	
	@Select("select * from Business where username = #{username}")
	public Business select_business_by_name(String username);

	@Select("select * from Business whree id = #{id}")
	public Business select_business_by_id(int id);
	
	@Delete("delete from Business where id = #{id}")
	public void delete_business_id(int id);
	
	@Update("update business set state = 1 where id = #{id}")
	public void update_business_id(int id);
	
	
	
	
	
	
	
	
	
	@Insert("insert into Business(username,useraddress,bookid,userphone,state) values(#{username},#{useraddress},#{bookid},#{userphone},#{state})")
	public void  insert_business(Business u);


	
	
	

}
