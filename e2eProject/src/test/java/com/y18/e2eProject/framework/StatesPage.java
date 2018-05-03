package com.y18.e2eProject.framework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.json.simple.JSONObject;

public class StatesPage {
	public String statesPageHomeURL, statesPageTitle;
	WebDriver driver;
	
	public StatesPage(WebDriver idriver) throws Exception {
		this.driver = idriver;
		StatesPageGetTestData();
		//getTestData();
	}
	
	public void StatesPageGetTestData() throws IOException, ParseException  {
		
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("/Users/madhavareddy/eclipse-workspace/everyday/e2eProject/src/test/java/com/y18/e2eProject/testdata/file.json"));
		JSONObject jsonObj = (JSONObject) obj;
		String userName = (String) jsonObj.get("userID");
		System.out.println(userName);
		
		this.statesPageHomeURL = (String) jsonObj.get("statesPageUrl");
		this.statesPageTitle = (String) jsonObj.get("statesPageTitle");
		//System.out.println("States Page URL from JSON method:"+statesPageHomeURL);		
	}
	
	@FindBy(how = How.ID, using="181")
	WebElement selectStateTexas;
	
	@FindBy(how = How.CSS, using = ("option['name=tx']"))
	WebElement selectBlueForTexas;
	
	
	
	public void selectStateOptionTexas() {
		selectStateTexas.click();
	}
	
	public void selectColorForStateList() {
		selectBlueForTexas.click();
	}
	
	public void viewS() {
		driver.get(statesPageHomeURL);
	}

	public String getStatesTitle() {
		
		return driver.getTitle();
	}
	
	
}// CLass ends here.
