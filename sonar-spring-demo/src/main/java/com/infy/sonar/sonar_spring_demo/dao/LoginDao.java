package com.infy.sonar.sonar_spring_demo.dao;

public interface LoginDao {

	public String getPassword(String username);
	
	public String getPasswordFromDB();
	
}
