package com.schoolapp.taseCases;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;

import org.testng.annotations.Test;

import com.schoolapp.pageObject.Admin;

import junit.framework.Assert;

public class TC_LoginDDL_002 extends BaseClass {
	
	TC_Login_001 tcl = new TC_Login_001();
	
	@Test
	public void dashboard()
	{
		tcl.loginTest();
		Admin ad = new Admin();
		ad.clickOnAdminButton();
	}
}
