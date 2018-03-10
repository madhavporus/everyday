package com.y18.cMonthMarch7.pages;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.y18.cMonthMarch7.testdata.*;

import com.google.gson.Gson;

//import com.y18.cMonthMarch7.helpers.*;

public class LoginAmzPage {
	
	WebDriver driver;
	//Help help = new Help();
	
	
	
	@FindBy(how = How.ID, using="nav-link-accountList") 
	WebElement mainLoginLink;
	
	@FindBy(how = How.ID, using="ap_email")
	WebElement uidInput;
	
	@FindBy(how = How.ID, using="continue")
	WebElement logincontinueBtn;
	
	@FindBy(how = How.ID, using="ap_password")
	WebElement pwdInput;
	
	@FindBy(how = How.ID, using="signInSubmit")
	WebElement signInSubmitBtn;
	
		
	
	public void openAmzHomePage() {
		mainLoginLink.click();
	}
	
	public static String testUserName;
	public static String testPWD;
	
	public void getTestData() {
		Gson gson = new Gson();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("/Users/madhavareddy/eclipse-workspace/everyday/cMonthMarch7/src/test/java/com/y18/cMonthMarch7/testdata/Login_TestData.json"));
			getterClassForLoginTestData uidPwdData = gson.fromJson(br, getterClassForLoginTestData.class);
			
			
			this.testUserName = uidPwdData.getUid(); 
			this.testPWD = uidPwdData.getPwd();
			
		} catch(IOException ie) {
			ie.printStackTrace();
		}
	}
	
	
	public void loginAmz() {
		getTestData();
		uidInput.sendKeys(testUserName);
		logincontinueBtn.click();
		pwdInput.sendKeys(testPWD);
		signInSubmitBtn.click();
		
	}
	
	
}
