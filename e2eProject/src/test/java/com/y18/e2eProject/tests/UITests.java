package com.y18.e2eProject.tests;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.y18.e2eProject.framework.*;

/*
 * Best practice followed in this test is: Separated all navigational steps to corresponding pages and used 
 * PageFactory to initiate elements and methods of the pages classes.
 * Used 2 different techniques one is using Gson library(For homepage) and another one is SimpleJson(StatesPage and other)
 * Used explicit wait mechanism and came up with a reusable method where I can just pass driver, element and time I wish webdriver to wait
 * this method is in Browser class with name "explictWaitTillElmAvailable"
 */

public class UITests {
	
	
@Test(priority=1)
public void startBrowser() throws Exception {
	 HomePage homePage = GoTo.homePage("Chrome");
	 homePage.view();
	 homePage.selectJenkinsRadioBtn();
	 System.out.println("--------------");
	 Assert.assertEquals(homePage.getResult(), homePage.jenkinsOptionText);
}

@Test(priority=2)
 public void statePage() throws Exception {
	StatesPage statesPage = GoTo.statespage("firefox");
	statesPage.viewS();
	statesPage.selectStateOptionTexas();
	Assert.assertEquals(statesPage.getStatesTitle(),statesPage.statesPageTitle);
}
	
@Test(priority=3)
 public void dynamicPage() {
	DynamicPage dynamicPage = GoTo.dynamicPage("CHROME");
	dynamicPage.view();
	
	Assert.assertEquals(dynamicPage.actualDynamicText(),dynamicPage.expDynamicElmTxt);
	
	
}

@AfterMethod
public void closeall() {
	//GoTo.closeDriver();
}
}