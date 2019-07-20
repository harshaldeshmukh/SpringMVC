package com.mrsac.springmvc.dao;

import com.mrsac.springmvc.model.Login;
import com.mrsac.springmvc.model.User;

public interface UserDao {
	
void register(User user);
User login(Login login);

}
