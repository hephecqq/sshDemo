package com.kostech.servlet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DispatcherFilter implements Filter {

	public FilterConfig config;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain arg2)
			throws IOException, ServletException {
		String blacklist=request.getRemoteAddr();
		if(FilterUtils.isBlacklist(config, blacklist)){
			
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		this.config=arg0;
	}

}
