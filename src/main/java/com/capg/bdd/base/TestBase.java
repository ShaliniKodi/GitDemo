package com.capg.bdd.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	Properties property;
	
	public TestBase()
	{
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\richeriy\\SeleniumTrainingNew\\BDDFirst\\config\\config.properties");
		    property=new Properties();
		    property.load(fis);
		    String browser=property.getProperty("browser");
		    if(browser.equalsIgnoreCase("chrome"))
		    {
		    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\richeriy\\Desktop\\PuneChennai\\chromedriver_win32 (4)\\chromedriver.exe");
				driver=new ChromeDriver();
		    
		    }
		    else if(browser.equalsIgnoreCase("ff"))
		    {
		    	driver=new FirefoxDriver();
		    }
		    
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void loadPage()
	{
		driver.get(property.getProperty("url"));
		driver.manage().window().maximize();
	}

}
