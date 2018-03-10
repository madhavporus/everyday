package com.y18.cMonthMarch7.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Help {
	static WebDriver driver;
	
	
	/*public Help(WebDriver idriver) {
		this.driver = idriver;
	}*/
	
	public static WebDriver startBrowser(String browserKind) {
		if(browserKind.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if(browserKind.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		} else if(browserKind.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Error:: Your Input for the browser/app url is incorrect");
		}
		return driver;
	}

	


} // End of class //
