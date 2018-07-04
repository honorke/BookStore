package com.software.dao;




import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;


import com.software.entity.BookTitle;
import com.software.entity.Remark;

@Repository
public interface Remark_mapper {
	
	@Select("select * from Remark")
	public List<Remark> select();
	
	@Select("select * from Remark where remarkNo = #{remarkNo}")
	public List<Remark> selectRemark_by_no(int remarkNo);
	
	@Insert("insert into remark(remarkAuthor, remarkContex, remarkNo, remarkStar) values(#{remarkAuthor},#{remarkContex},#{remarkNo},#{remarkStar})")
	public void insert_remark(Remark r);
	

}
