package com.y18.e2eProject.tests;
import org.testng.annotations.Test;

import com.y18.e2eProject.framework.*;

public class UITests {
	
	
@Test(priority=1)
public void startBrowser() throws Exception {
	Pages.homePage().goTo();
}
	
@Test(priority=2)
public void selectRadio() throws Exception {
	Pages.homePage().goTo();
	Pages.homePage().selectJenkinsRadioBtn();
}
	

}
