package com.kostech.pattern.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SimpleJdbcQueryTemplate {

	Connection conn=null;
	public <T> T query(String queryString,ResultSetHandler<T> handler){
		//define variable...;
		try{
			conn=getConnection();
			Statement pstmt=conn.prepareStatement(queryString);
			ResultSet rs=pstmt.executeQuery("sql");
			return handler.handle(rs);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}
	private Connection getConnection() {
		
		return null;
	}

	
}
