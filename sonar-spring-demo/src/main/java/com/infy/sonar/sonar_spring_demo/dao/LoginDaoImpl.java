package com.infy.sonar.sonar_spring_demo.dao;

public class LoginDaoImpl implements LoginDao {


	public String getPassword(String username) {
		// TODO Auto-generated method stub
		String password = null;
		password = username.substring(0, 3)+"@123";
		return password;
	}


	public String getPasswordFromDB() {
		//blocked due to absence of db
		return null;
	}

}
