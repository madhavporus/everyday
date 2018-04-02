package com.y18.e2eProject.framework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.google.gson.Gson;
import com.y18.e2eProject.browser.Browser;
import com.y18.e2eProject.browser.Browser.*;
import com.y18.e2eProject.testdata.HomePageTestData;

public class HomePage {
	public String url, pageTitle;

	public HomePage() throws Exception {
		Gson gson = new Gson();
		BufferedReader br = new BufferedReader(new FileReader("/Users/madhavareddy/eclipse-workspace/everyday/e2eProject/src/test/java/com/y18/e2eProject/testdata/file.json"));
		HomePageTestData td = gson.fromJson(br, HomePageTestData.class);
		this.url = td.gethomePageUrl();
		this.pageTitle = td.gethomePageTitle();	
	}
	
	@FindBy(how = How.CSS, using = "input[class='xyz']")
	WebElement selectJenkinsRadioBtn;
	
	//WebElement selectJenkinsRadioBtn =  
	
	@FindBy(how = How.ID, using = "seleniumid") 
	WebElement CheckSeleniumCheckBox;
	
	@FindBy(how = How.CSS, using = ("option[class='drplist']"))
	 List<WebElement> listOfItemsInDropDownBox;
	
	public WebDriver goTo() {
		Browser.browser("Firefox");
		WebDriver driver = Browser.goTo(url);
		return driver;
	}
	
	public void goTox() {
		Browser.browser("Firefox");
		Browser.goTo(url);
	}
	
	public void selectJenkinsRadioBtn() {
		Browser.selectRadioBtn(selectJenkinsRadioBtn);
	}
	
	
	

}
