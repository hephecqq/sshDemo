package com.kostech.servlet.filter;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilterUtils{
	
	public static boolean isBlacklist(FilterConfig config,String blacklist){
		boolean flag=false;
		if(config.getInitParameter("blacklist").indexOf(blacklist)>0){
			flag=true;
		}
		return flag;
		
	}
	
}