package com.capg.badd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capg.bdd.base.TestBase;

public class LoginPage extends TestBase{
	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(xpath="//*[@id='customer_login']/div[1]/form/p[3]/input[3]")
	WebElement login;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterCredentials(String user,String pass)
	{
		username.sendKeys(user);
		password.sendKeys(pass);
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
	public String findtitle()
	{
		return driver.getTitle();
	}
	
	
	
	
	

}
