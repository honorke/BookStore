package com.software.service;

import java.util.List;


import com.software.entity.BookTitle;
import com.software.utils.SearchInfo;

public interface BookTitle_service {
	public List<BookTitle> select(SearchInfo info);
	
	public BookTitle selectBook_by_id(int book_id);
	
	public void updateBook(BookTitle b);
	
	//这是新的
	public List<BookTitle>select_English();
	
	public List<BookTitle>select_Book(int classNo);

}
