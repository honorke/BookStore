package com.software.dao;




import java.util.List;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;



import com.software.entity.Remark;
import com.software.entity.User;
import com.software.entity.cart;

@Repository
public interface Cart_mapper {
	
	@Select("select * from cart")
	public List<cart> select();
	
	@Select("select * from cart where username = #{username}")
	public List<cart> select_cart_by_name(String username);

	@Select("select * from cart whree id = #{id}")
	public cart select_cartr_by_id(int id);
	
	
	
	
	
	
	
	@Insert("insert into cart(username,bookid) values(#{username},#{bookid})")
	public void  insert_cart(cart u);
	
	
	@Delete("delete from cart where id = #{id}")
	public void delete_cart(int id);
	
	
	

}
