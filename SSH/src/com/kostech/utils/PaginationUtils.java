package com.kostech.utils;

import java.util.List;

import com.kostech.beans.Pagination;

public class PaginationUtils {

	//加载数据库数据
	public static Pagination page=new Pagination();
	static{
		initPage();
	}
	public static void initPage(){
		page.setCurrPage(1);
		page.setId(System.currentTimeMillis());
		page.setPerPage(20);
		page.setTotalPage(20);
	}
	public static List<Pagination> getAll(){
		return null;
		
	}
}
