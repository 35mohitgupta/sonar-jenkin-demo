package com.infy.sonar.sonar_spring_demo;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.infy.sonar.sonar_spring_demo.service.LoginService;
import com.infy.sonar.sonar_spring_demo.service.LoginServiceImpl;

@SpringBootTest
class SonarSpringDemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void validLogin() {
		LoginService loginService = new LoginServiceImpl(); 
		Assert.assertTrue(loginService.isLoginValid("mohit", "moh@123"));
	}
	
	@Test
	public void inValidLogin() {
		LoginService loginService = new LoginServiceImpl(); 
		Assert.assertFalse(loginService.isLoginValid("mohit", "mohit@123"));
	}

}
