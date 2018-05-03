package com.y18.e2eProject.testdata;

// This is a constructor to initialize the test data coming from JSON file.
// This is on way og getting the test data from JSON, which is using Gson library

// Other way I used for 'StatesPage' test data is by Simple Json ( You need to get the Dependency in Maven pom)

 public class HomePageTestData {
		String homePageUrl, homePageTitle,homePageTextForJenkinsOption;
		
		public HomePageTestData(String ihomePageUrl, String ihomePageTitle, String ihomePageTextForJenkinsOption) {
			this.homePageUrl = ihomePageUrl;
			this.homePageTitle = ihomePageTitle;	
			this.homePageTextForJenkinsOption = ihomePageTextForJenkinsOption;
		}
		
		public String gethomePageUrl() {
			return homePageUrl;
		}
		
		public String gethomePageTitle() {
			return homePageTitle;
		}
	
		public String getJenkinsOptionResultTxt() {
			return homePageTextForJenkinsOption;
		}
 }
	

