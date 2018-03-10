package com.y18.mar5.helpers;

public class Helpers_BestPractice {
	
	
public static void browserSetup() {
	System.out.println("browserSetup() method is to initialize the browser!");
	}
	

	public static void logIn() {
		System.out.println("logIn() method is to login to the application under test");
	}
	
	public static void dataBaseConnectivity() {
		
		System.out.println("dataBaseConnectivity() method is to connect to a Data base");
	}

	public static void imageComparision() {
		
		System.out.println("imageComparision() method is to compare 2 images and return the pass or fail result");
	}
	
	public static void pdfComparision() {
		System.out.println("pdfComparision() method is to compare 2 pdf docs and return the pass or fail result");
	}
	
	//"Some time we need to generate a random string or integers for testing purpose, 
	//in which case you can use a common method called generator.
	
	public static void generators() {
		System.out.println("generators() is to generate a randon string/integerator");
	}
	
	public static void dubleClick() {
		System.out.println("dubleClick() - Since Selenium does not have double click you can have it clicked 1 times here!");
	}
	
	
	public static void main(String[] args) {
		browserSetup();
		logIn();
		dataBaseConnectivity();
		imageComparision();
		pdfComparision();
		generators();
		dubleClick();
	}
	
	
	
}
