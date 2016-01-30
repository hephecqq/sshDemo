package com.kostech.service;

import com.kostech.beans.User;
import com.kostech.dao.UserDAO;

public class UserService {

	public boolean valid(String username,String password){
		UserDAO dao=new UserDAO();
		User user=dao.getUser("admin");
		if(user.getPassword().equals(password)){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		UserService service=new UserService();
		boolean login=service.valid("admin","admin");
		System.out.println("验证结果:"+login);
	}
}
