package com.software.service;

import java.util.List;


import com.software.entity.BookTitle;
import com.software.entity.Remark;

public interface Remark_service {
	public List<Remark> select();
	
	public List<Remark> selectRemark_by_no(int remark_no);
	
	public void insert_remark(Remark r);

}
