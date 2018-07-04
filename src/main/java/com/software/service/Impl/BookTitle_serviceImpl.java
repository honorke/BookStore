package com.software.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.software.dao.BookTitle_mapper;
import com.software.entity.BookTitle;
import com.software.service.BookTitle_service;
import com.software.utils.SearchInfo;

@Service
public class BookTitle_serviceImpl implements BookTitle_service {

	@Autowired
	BookTitle_mapper mapper;
	public List<BookTitle> select(SearchInfo info) {
		// TODO Auto-generated method stub
		return mapper.select(info);
	}
	
	
	public BookTitle selectBook_by_id(int bookId) {
		return mapper.selectBook_by_id(bookId);
	}


	public void updateBook(BookTitle b) {
		// TODO Auto-generated method stub
		mapper.updateBook(b);
		
	}


	public List<BookTitle> select_English() {
		// TODO Auto-generated method stub
		return mapper.select_English();
	}


	public List<BookTitle> select_Book(int classNo) {
		// TODO Auto-generated method stub
		return mapper.select_Book(classNo);
	}

	

}
