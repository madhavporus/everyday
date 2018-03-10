package com.y18.cMonthMarch7.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

import com.y18.cMonthMarch7.helpers.Help;
import com.y18.cMonthMarch7.pages.*;

public class LoginAmzTC {
	WebDriver driver;
	String url = "https://amazon.com";
	
	@BeforeTest
	public void openApplication() {	
		this.driver = Help.startBrowser("Chrome");
		driver.get(url);
	}
	
	@Test(priority=0)
	public void accessMainPage() {
		LoginAmzPage loginPage = PageFactory.initElements(driver, LoginAmzPage.class);
		loginPage.openAmzHomePage();
	}

	@Test(priority=1)
	public void loginTpAmz() {
		LoginAmzPage loginPage = PageFactory.initElements(driver, LoginAmzPage.class);
		loginPage.loginAmz();
	
		
	}
	
	
}
