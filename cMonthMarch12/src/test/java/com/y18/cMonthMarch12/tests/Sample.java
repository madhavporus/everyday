package com.y18.cMonthMarch12.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Sample {
	
	static WebDriver driver;
	
	/*@FindBy(how = How.CSS, using = "input[class='xyz']")
	static WebElement selectJenkinsRadioBtn;*/
	
	
	@Test
	public static void test() {
		 driver = new ChromeDriver();
		
		 driver.get("file:///Users/madhavareddy/eclipse-workspace/everyday/e2eProject/src/main/webapp/mwebapp.html");
		 WebElement selectJenkinsRadioBtn = driver.findElement(By.cssSelector("input[class='xyz']"));
		 String x = selectJenkinsRadioBtn.getAttribute("value");
		 selectJenkinsRadioBtn.click();
		 System.out.println("JJJJJJJ:"+x);
	}

}
