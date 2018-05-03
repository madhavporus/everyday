package com.y18.e2eProject.framework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.y18.e2eProject.browser.Browser;
import com.y18.e2eProject.framework.*;


public abstract class Pages {	
	public abstract void page() throws Exception;
}

//	public static HomePage homePage() throws Exception
//	{
//		HomePage hp = new HomePage();
//		HomePage homePage = PageFactory.initElements(hp.goTo(), HomePage.class);
//				//new HomePage();
//		return homePage;
//	}

