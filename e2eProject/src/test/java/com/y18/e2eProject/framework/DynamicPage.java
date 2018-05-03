package com.y18.e2eProject.framework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.y18.e2eProject.browser.Browser;

public class DynamicPage {
	public String dynamicPageURL, expDynamicElmTxt;
	WebDriver driver;
	
	public DynamicPage(WebDriver ideriver) throws FileNotFoundException, IOException, ParseException {
		this.driver = ideriver;
		getDynamicPageData();
		
	}
	
	public void getDynamicPageData() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("/Users/madhavareddy/eclipse-workspace/everyday/e2eProject/src/test/java/com/y18/e2eProject/testdata/file.json"));
		JSONObject jObject = (JSONObject) obj;
		this.dynamicPageURL = (String) jObject.get("dynamicPageURL");
		this.expDynamicElmTxt = (String) jObject.get("expectedDynamicElmTxt");
		
	}
	
	public void view() {
		driver.get(dynamicPageURL);
	}
	
	/*@FindBy(how = How.ID, using = "start")
			WebElement elmStartBtn;*/
	
	@FindBy(how = How.CSS, using = "div#start button")
	WebElement elmStartBtn;
	
	@FindBy(how = How.ID, using = "finish")
	WebElement elmTxt;
	
	public void clickOnStart() {
		Browser.explictWaitTillElmAvailable(driver, 5, elmStartBtn);
		elmStartBtn.click();
	}
	
	public String getStartResultText() {
		Browser.explictWaitTillElmAvailable(driver, 5, elmTxt);
		String xx = elmTxt.getText();
		System.out.println("VALUE OF DYNAMIC TEXT RESULT"+xx);
		return xx;
	}

	public String actualDynamicText() {
		//Browser.explictWaitTillElmAvailable(driver, 10, elmStartBtn);
		System.out.println("STARTE BTN TEXT IS:"+elmStartBtn.getText());
		
		//elmStartBtn.click();
		//elmStartBtn.click();
		elmStartBtn.sendKeys(Keys.ENTER);
		
		Browser.explictWaitTillElmAvailable(driver, 20, elmTxt);
		String xx = elmTxt.getText();
		System.out.println("VALUE OF DYNAMIC TEXT RESULT:"+xx);
		return xx;
		
	}
	
	
	
}

