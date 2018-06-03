  package com.y18.e2eProject.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	public static WebElement explictWaitTillElmAvailable(WebDriver idriver, int secsToWait, WebElement elm) {
		WebDriverWait wait = new WebDriverWait(idriver, secsToWait);
		WebElement elmt = wait.until(ExpectedConditions.visibilityOf(elm));
		//WebElement elmt = wait.until(ExpectedConditions.elementToBeClickable(elm));
		System.out.println("Explicit wait method is executed!");
		return elmt;
	}
}


