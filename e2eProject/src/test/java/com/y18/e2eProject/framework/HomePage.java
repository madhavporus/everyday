package com.y18.e2eProject.framework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.google.gson.Gson;
import com.y18.e2eProject.browser.Browser;
//import com.y18.e2eProject.browser.Browser;
//import com.y18.e2eProject.browser.Browser.*;
import com.y18.e2eProject.testdata.HomePageTestData;

public class HomePage {
	public String url, pageTitle, jenkinsOptionText;
	WebDriver driver;
	
	
	public HomePage(WebDriver inDriver) throws FileNotFoundException {
		this.driver = inDriver;
		HomePageGetTestData(); // This is the method to get the data from JSON.
	}
	
	// Below method is to get the test data from JSON file using Gson libraray.
	// Gson library needs a constructor in a class with variable names exactly the same as ones we have in JSON.
	// In this case, we used 'HomePageTestData' class.
	// For the 'StatesPage' we used the library called 'SimpleJSON' for which we don't need this special constructor.
	// Just compare both and see for your understanding and choose the one you like.
	
	public void HomePageGetTestData() throws FileNotFoundException{
		Gson gson = new Gson();
		BufferedReader br = new BufferedReader(new FileReader("/Users/madhavareddy/eclipse-workspace/everyday/e2eProject/src/test/java/com/y18/e2eProject/testdata/file.json"));
		HomePageTestData td = gson.fromJson(br, HomePageTestData.class);
		this.url = td.gethomePageUrl();
		this.pageTitle = td.gethomePageTitle();	
		this.jenkinsOptionText = td.getJenkinsOptionResultTxt();
	}
	
	@FindBy(how = How.CSS, using = "input[class='xyz']")
	WebElement selectJenkinsRadioBtn;
	
	//WebElement selectJenkinsRadioBtn =  
	
	@FindBy(how = How.ID, using = "seleniumid") 
	WebElement CheckSeleniumCheckBox;
	
	@FindBy(how = How.CSS, using = ("option[class='drplist']"))
	 List<WebElement> listOfItemsInDropDownBox;
	
	@FindBy(how = How.ID, using="actionResult")
	WebElement result;
	
	public void view() {
		driver.get(url);
		
	}
	
	
	
	public void selectJenkinsRadioBtn() {
		
		Browser.explictWaitTillElmAvailable(driver, 20, selectJenkinsRadioBtn);
		selectJenkinsRadioBtn.click();
	}
	
	public String getResult() {
		return result.getAttribute("value");
	}

	
	
	
	
	

}
