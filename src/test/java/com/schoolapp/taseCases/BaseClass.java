package com.schoolapp.taseCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseUrl="http://app.visionedutours.com/Login/index/";
	public String username= "admin@gmail.com";
	public String password= "admin";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//good day//workspace//SchoolAppV1//Drivers//chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"Drivers//chromedriver.exe");
		driver = new ChromeDriver(); 
	}
	
//	@AfterClass
//	public void tearDown()
//	{
//		driver.quit();
//	}
}
