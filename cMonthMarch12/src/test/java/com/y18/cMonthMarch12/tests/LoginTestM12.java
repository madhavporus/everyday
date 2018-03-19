package com.y18.cMonthMarch12.tests;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.y18.cMonthMarch12.helpers.*;
import com.y18.cMonthMarch12.pages.*;

public class LoginTestM12 {
WebDriver driver;
 
@BeforeTest
public void openAppInBrowser() {
	driver = BrowserFactory.openAppByAnyBrowserType("Firefox", "https://www.amazon.com");

}

@Test(priority=1)
public void verifyLogin() {
	//Initiate all webElements of LoginPage using selenium's 'PageFactory' support!
	LoginPageM12 lp = PageFactory.initElements(driver, LoginPageM12.class);  
	//Below method intern calls the getTestDataFromJSON() method to get the required test data to login! 
	lp.loginApp();
	Assert.assertEquals(lp.actualPageTitle(),lp.expectedPageTitle());
	
	}

@Test(priority=2)
public void verifyCreateList() {
	LoginPageM12 lp = PageFactory.initElements(driver, LoginPageM12.class);  
	Assert.assertEquals(lp.actualPageTitleOfCreateList(),lp.expectedPageTitleOfCreateList());
}




} //Class ends here...!
