package com.schoolapp.taseCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.schoolapp.pageObject.LoginPage;

import junit.framework.Assert;

public class TC_Login_001 extends BaseClass {

	@Test
	public void loginTest() {
		driver.get(baseUrl);
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("App Login"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	
}
