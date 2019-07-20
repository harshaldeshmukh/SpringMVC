package com.mrsac.springmvc.services;

import com.mrsac.springmvc.model.Login;
import com.mrsac.springmvc.model.User;

public interface UserService {
	void register(User user);
	User login(Login login);

}
