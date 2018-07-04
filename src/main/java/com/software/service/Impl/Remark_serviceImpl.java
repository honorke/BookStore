package com.software.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.software.dao.BookTitle_mapper;
import com.software.dao.Remark_mapper;
import com.software.entity.BookTitle;
import com.software.entity.Remark;
import com.software.service.BookTitle_service;
import com.software.service.Remark_service;

@Service
public class Remark_serviceImpl implements Remark_service {

	@Autowired
	Remark_mapper mapper;
	public List<Remark> select() {
		// TODO Auto-generated method stub
		return mapper.select();
	}
	
	
	public List<Remark> selectRemark_by_no(int remark_no) {
		return mapper.selectRemark_by_no(remark_no);
	}


	public void insert_remark(Remark r) {
		// TODO Auto-generated method stub
		mapper.insert_remark(r);
		
	}
	
	

	

}
