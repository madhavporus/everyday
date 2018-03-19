package com.y18.cMonthMarch12.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class Utils {
	
	public static void mouseOver(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		System.out.println("*******The element attr:"+element.getText());
		
	}
	
	/*
	public static void selectMenuItem(WebElement el, String valueToSelect) {
			     Select statusDropdown=new Select(el);
			     statusDropdown.selectByVisibleText(valueToSelect);
	}*/

}
