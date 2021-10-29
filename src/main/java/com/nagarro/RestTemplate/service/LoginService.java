package com.nagarro.RestTemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.RestTemplate.dao.LoginDao;
import com.nagarro.RestTemplate.model.LoginForm;

/**
 * Login Service Class
 * 
 * @author maibu
 *
 */
@Service
public class LoginService {

	@Autowired
	private LoginDao loginDao;
	
	//Declaration of validate method
	public boolean validateUser(LoginForm user) {
		return this.loginDao.validateUser(user);
	}
}
