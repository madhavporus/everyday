package com.y18.cMonthMarch12.pages;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.y18.cMonthMarch12.testdata.*;
import com.y18.cMonthMarch12.helpers.*;

//import bsh.util.Util;

import com.y18.cMonthMarch12.helpers.Utils;

import com.google.gson.Gson;

public class LoginPageM12 {	
	WebDriver driver;
	public LoginPageM12(WebDriver cDriver) {
		this.driver = cDriver;
		
	}
	
	@FindBy(how = How.CSS, using = "a[class='nav-a nav-a-2'")
	//@FindBy(how = How.ID, using = "nav-link-accountList")
	WebElement loginLinkELm;
	
//	@FindBy(how = How.CSS, using = "input.a-input-text.a-span12.auth-autofocus.auth-required-field")
	@FindBy(how = How.CSS, using = "[name='email']")
	WebElement uidInputElm;
			
	@FindBy(how = How.CSS, using = "input.a-button-input") 
	WebElement continueBtbElm;
	
	@FindBy(how = How.CSS, using = "input.a-input-text.a-span12.auth-autofocus.auth-required-field")
	WebElement pwdInputElm;
	
	@FindBy(how = How.XPATH, using=".//*[@class='a-button-input' and @id='signInSubmit']")
	WebElement signInBtnElm;
	
	//@FindBy(how = How.ID, using ="nav-link-accountList")
	@FindBy(how = How.ID, using ="ap_email")
	WebElement menuElmToCreateList;
	
	//@FindBy(how = How.ID, using = "nav-al-your-account") WebElement parentOfListElms;
	
	
	//working 
	@FindBy(how = How.CSS, using = ("span[class='nav-text']"))
	List<WebElement> listOfMenus;
	
	
	
	
	
	// GETTING TEST DATA
	public static String uid;
	public static String pwd;
	public static String pageTitle;
	public static String expectedPageTitleOfCreateList;
	String createListPageTitle;
	
	public void getTestDataFromJSON() {
		Gson gson = new Gson();
		try {
			BufferedReader br = new BufferedReader(new FileReader("/Users/madhavareddy/eclipse-workspace/everyday/cMonthMarch12/src/test/java/com/y18/cMonthMarch12/testdata/loginTestData.json"));
			GetterSetterOfLoginPageTestData td = gson.fromJson(br, GetterSetterOfLoginPageTestData.class);
			
			this.uid = td.getUid();
			this.pwd = td.getPwd();
			this.pageTitle = td.getLoginPageTitle();
			this.expectedPageTitleOfCreateList = td.getexpectedPageTitleOfCreateList();
			
		} catch(IOException ie) {
			ie.printStackTrace();
		}
	}
	
	public void loginApp() {
		getTestDataFromJSON();  // Calling the method which gets the test data from JSON file(Check above)
		loginLinkELm.click();
		//uidInputElm.sendKeys("ninjaqa1@gmail.com");
		uidInputElm.sendKeys(uid);
		continueBtbElm.click();
		//pwdInputElm.sendKeys("doublehelix123");
		pwdInputElm.sendKeys(pwd);
		signInBtnElm.click();
	}
	
	public String expectedPageTitle() {
		return pageTitle;
	}
	
	public String actualPageTitle() {
		return driver.getTitle();
	}
	
	public String expectedPageTitleOfCreateList() {
		return expectedPageTitleOfCreateList;
	}
	
	public String actualPageTitleOfCreateList() {
		Utils.mouseOver(driver, menuElmToCreateList);
		int x=1;
		System.out.println("++++++++++++++++++++++++++");
		for(WebElement we:listOfMenus) {
			System.out.println("The name of list item:"+x+")"+we.getText());
			if(we.getText().equalsIgnoreCase("Your Lists")) {
				we.click();
				createListPageTitle = driver.getTitle();
				break;
			}
			x=x+1;
		}
		return createListPageTitle;
	}
} //Class ends here...