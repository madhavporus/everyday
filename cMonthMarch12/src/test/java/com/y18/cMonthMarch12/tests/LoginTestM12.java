package com.y18.cMonthMarch12.tests;

import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import com.y18.cMonthMarch12.helpers.*;
import com.y18.cMonthMarch12.pages.LoginPageM12;

//If you want to run this test on selenium remote webdriver, we need to run server locally using the below command before starting this test.
// java -jar selenium-server-standalone-3.11.0.jar -role hub

public class LoginTestM12 {
WebDriver driver;
 
@BeforeTest
public void openAppInBrowser() throws Exception {
	//driver = BrowserFactory.openAppByAnyBrowserType("chrome", "https://www.amazon.com");
	driver = BrowserFactory.openAppByAnyBrowserType("firefox", "https://www.amazon.com");
}

@Test(priority=1)
public void verifyLogin() {
	//Initiate all webElements of LoginPage using selenium's 'PageFactory' support!
	LoginPageM12 lp = PageFactory.initElements(driver, LoginPageM12.class);
	//Below method intern calls the getTestDataFromJSON() method to get the required test data to login! 
	lp.loginApp();
	AssertJUnit.assertEquals(lp.actualPageTitle(),lp.expectedPageTitle());
	}

@Test(priority=2)
public void verifyCreateList() {
	LoginPageM12 lp = PageFactory.initElements(driver, LoginPageM12.class);
	AssertJUnit.assertEquals(lp.actualPageTitleOfCreateList(),lp.expectedPageTitleOfCreateList());
}

} //Class ends here...!
