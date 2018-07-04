package com.software.dao;




import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;


import com.software.entity.BookTitle;
import com.software.utils.SearchInfo;

@Repository
public interface BookTitle_mapper {
	
	@Select("select * from BookTitle ${limit}")
	public List<BookTitle> select(SearchInfo info);
	
	@Select("select * from BookTitle where bookId = #{bookId}")
	public BookTitle selectBook_by_id(int bookId);
	
	@Insert("insert into BookTitle(bookno, bookname, bookpicture, bookwriter, bookPublish, bookPublishDate, bookNowPrice) values(#{bookNo},#{bookName},#{bookPicture},#{bookWriter},#{bookPublishDate},#{bookNowPrice})")
	public void insertBook(BookTitle b);
	
	@Delete("delete from BookTitle where bookId = #{bookId}")
	public void deleteBook(int bookId);
	
	@Update("update BookTitle set bookNo = #{bookNo}, bookName = #{bookName}, BookPicture = #{bookPicture}, BookWriter = #{bookWriter},BookPublishDate = #{bookPublishDate},bookNowPrice = #{bookNowPrice} ,bookPrePrice = #{bookPrePrice} where bookId = #{bookId}")
	public void updateBook(BookTitle b);
	
	//这是新的
	@Select("select * from BookTitle where class = 0")
	public List<BookTitle>select_English();
	
	@Select("select * from BookTitle where class = #{classNo}")
	public List<BookTitle>select_Book(int classNo);
	
	

}
