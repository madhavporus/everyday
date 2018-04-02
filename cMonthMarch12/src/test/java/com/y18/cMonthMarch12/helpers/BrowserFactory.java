package com.y18.cMonthMarch12.helpers;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class BrowserFactory {
	
	public static WebDriver openAppByAnyBrowserType(String browserType, String appUrl) throws Exception {
		WebDriver driver=null;	
		if(browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/madhavareddy/eclipse-workspace/ma_support_files/chromedriver");
			//driver = new RemoteWebDriver("http://localhost:9515", DesiredCapabilities.chrome());
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
			driver = new ChromeDriver();
		}else if(browserType.equalsIgnoreCase("Firefox")){
			// Below line is needed for the latest firefox browsers. you need to download the Geko driver and give the path.
			System.setProperty("webdriver.gecko.driver","/Users/madhavareddy/eclipse-workspace/ma_support_files/geckodriver");
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new FirefoxOptions());
			driver = new FirefoxDriver();
		}else if(browserType.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(appUrl);
		return driver;
	}
	
	
	
}
