package com.software.utils;

public class SearchInfo {
	String where;
	String limit;
	int maxrow = 99;
	int pageno;
	
	public int getPrev() {
		return pageno>1?pageno-1:pageno;
	}
	
	public int getNext()
	{
		return pageno+1;
	}
	
	public void setPageno(Integer pageno) {
		if(pageno == null) pageno = 1;
		this.pageno = pageno;
		limit = " limit " + ((pageno-1)*maxrow) +"," + maxrow;
		System.out.println(limit);
	}
	
	public int getPageno() {
		return pageno;
	}
	
	public void setWhere(String where) {
		this.where = where;
	}
	
	public String getLimit() {
		return limit;
	}

	

}
