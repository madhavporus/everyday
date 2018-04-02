package com.y18.e2eProject.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	static WebDriver driver = null;
	
	public static WebDriver browser(String browserKind) {
		if(browserKind.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/madhavareddy/eclipse-workspace/ma_support_files/chromedriver");
			driver = new ChromeDriver();
		}else if (browserKind.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","/Users/madhavareddy/eclipse-workspace/ma_support_files/geckodriver");
			driver = new FirefoxDriver();
		}else if(browserKind.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}
		return driver;
	}
	
	public static WebDriver goTo(String url) {
		driver.get(url);
		return driver;
	}
	
	public static String getTitle() {
		return driver.getTitle();
	}
	
	public static void selectRadioBtn(WebElement elm) {
		elm.click();
	}
}


