package com.y18.frameworkpoly.browser;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BroswerFactory {
public static WebDriver driver;
	public static WebDriver browser(String browserType) {
		if(browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/madhavareddy/eclipse-workspace/ma_support_files/chromedriver");
			//driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
			driver = new ChromeDriver();
		}else if(browserType.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","/Users/madhavareddy/eclipse-workspace/ma_support_files/geckodriver");
			//driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new FirefoxOptions());
			driver = new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		return driver;	
	}
	
	public static void goTo(String url) {
		 driver.get(url);
	}
	
	
	
}
