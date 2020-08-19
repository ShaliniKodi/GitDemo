package com.capg.bdd.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.capg.badd.pages.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class LoginStepDef {
	LoginPage login;
	
	@Before
	public void init()
	{
		
		login=new LoginPage();
	}
	
	
	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
				login.loadPage();
	   
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String user, String pass) throws Throwable {
	    login.enterCredentials(user, pass);
	  
	}

	@When("^user clicks on submit button$")
	public void user_clicks_on_submit_button() throws Throwable {
	   login.clickLogin();
	    
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	   Assert.assertEquals("My Account – Automation Practice Site", login.findtitle());
	    
	}
	
	



}
