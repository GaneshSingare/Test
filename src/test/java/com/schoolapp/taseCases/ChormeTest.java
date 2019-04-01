package com.schoolapp.taseCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChormeTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//good day//workspace//SchoolAppV1//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://app.visionedutours.com/Login/dashboard");
	}
}
