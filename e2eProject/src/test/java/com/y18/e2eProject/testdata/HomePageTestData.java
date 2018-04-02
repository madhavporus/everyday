package com.y18.e2eProject.testdata;

public class HomePageTestData {
	String homePageUrl, homePageTitle;
	
	public HomePageTestData(String ihomePageUrl, String ihomePageTitle) {
		this.homePageUrl = ihomePageUrl;
		this.homePageTitle = ihomePageTitle;	
	}
	
	public String gethomePageUrl() {
		return homePageUrl;
	}
	
	public String gethomePageTitle() {
		return homePageTitle;
	}
}
