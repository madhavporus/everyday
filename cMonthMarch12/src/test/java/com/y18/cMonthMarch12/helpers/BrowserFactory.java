package com.y18.cMonthMarch12.helpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserFactory {
	
	public static WebDriver openAppByAnyBrowserType(String browserType, String appUrl) {
		WebDriver driver=null;	
		if(browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/madhavareddy/eclipse-workspace/ma_support_files/chromedriver");
			//driver = new RemoteWebDriver("http://localhost:9515", DesiredCapabilities.chrome());

			driver = new ChromeDriver();
		}else if(browserType.equalsIgnoreCase("Firefox")){
			// Below line is needed for the latest firefox browsers. you need to download the Geko driver and give the path.
			System.setProperty("webdriver.gecko.driver","/Users/madhavareddy/eclipse-workspace/ma_support_files/geckodriver");
			driver = new FirefoxDriver();
		}else if(browserType.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}
		
		driver.get(appUrl);
		return driver;
	}
	
	
	
}
