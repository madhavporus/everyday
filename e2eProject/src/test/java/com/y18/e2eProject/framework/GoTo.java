package com.y18.e2eProject.framework;

import org.openqa.selenium.support.PageFactory;

import com.y18.e2eProject.browser.Browser;

import org.openqa.selenium.WebDriver;

public class GoTo {
	static WebDriver driver;
	
	public static HomePage homePage(String browserType) throws Exception
	{
		driver = Browser.browser(browserType);
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		return homePage;
	}

	public static StatesPage statespage(String browserType) throws Exception
	{
		driver = Browser.browser(browserType);
		StatesPage statesPage = PageFactory.initElements(driver, StatesPage.class);
		return statesPage;
	}
	
	public static DynamicPage dynamicPage(String browserType) {
		driver = Browser.browser(browserType);
		DynamicPage dynamicPage = PageFactory.initElements(driver,DynamicPage.class);
		return dynamicPage;
	}
	
	
	 public static void closeDriver() {
			driver.quit();
		}
}