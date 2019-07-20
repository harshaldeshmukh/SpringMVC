package com.mrsac.springmvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mrsac.springmvc.dao.UserDao;
import com.mrsac.springmvc.model.Login;
import com.mrsac.springmvc.model.User;

public class UserServiceImpl implements UserService {

	 @Autowired
	  public UserDao userDao;
	 
	 
	@Transactional
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		System.out.println("UserServiceImpl --- >" + user.getUsername1());
		userDao.register(user);
		
	}


	@Override
	public User login(Login login) {
		// TODO Auto-generated method stub
		
		System.out.println("UserServiceImpl --- >" + login.getUsername());
		return userDao.login(login);
		
	}

}
