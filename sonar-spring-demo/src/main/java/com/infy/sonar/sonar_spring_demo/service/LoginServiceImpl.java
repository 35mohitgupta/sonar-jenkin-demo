package com.infy.sonar.sonar_spring_demo.service;

import com.infy.sonar.sonar_spring_demo.dao.LoginDao;
import com.infy.sonar.sonar_spring_demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService{

	public boolean isLoginValid(String username, String password) {
		// TODO Auto-generated method stub
		LoginDao loginDao = new LoginDaoImpl();
		return password.equals(loginDao.getPassword(username));
	}

}
