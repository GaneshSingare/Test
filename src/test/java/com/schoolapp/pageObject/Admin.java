package com.schoolapp.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin {
	
	@FindBy(xpath="//span[@xpath='1']")
	WebElement admin;
	
	@FindBy(xpath="//span[@xpath='1']")
	WebElement add;
	
	@FindBy(xpath="//span[contains(text(),'Admin List')]")
	WebElement list;
	
	public void clickOnAdminButton() {
		admin.click();
		}
	public void clickOnAddAdminButton() {
		add.click();
	}
	public void clickOnListAdminButton() {
		list.click();

	}
	
	
}
