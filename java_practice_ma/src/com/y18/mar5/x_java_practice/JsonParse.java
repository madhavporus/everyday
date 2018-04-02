package com.y18.mar5.x_java_practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
//import com.y18.cMonthMarch12.testdata.GetterSetterOfLoginPageTestData;

public class JsonParse {
	public static void main(String[] args) throws Exception{
		JsonParseGetters testDataObject = deserializeNested();
		//deserializeNested();
		System.out.println("APP URL IS: "+testDataObject.AppMainURL);
		
		System.out.println("USER NAME IS: "+testDataObject.userTestData.uName); 
		System.out.println("USER NAME ID IS:"+testDataObject.userTestData.uID); 
		System.out.println("USER COUNTRY IS:"+testDataObject.userTestData.uCountry);
		
		System.out.println("YAHOO_FINANCE_HOME_PAGE_URL IS:"+testDataObject.yahooFinanceHomePageTestData.YAHOO_FINANCE_HOME_PAGE_URL); 
		System.out.println("YAHOO_FINANCE_HOME_PAGE_TITLE IS:"+testDataObject.yahooFinanceHomePageTestData.YAHOO_FINANCE_HOME_PAGE_TITLE); 
		
		System.out.println("YAHOO_FINANCE_WATCHLIST_PAGE_URL IS:"+testDataObject.yahooFinanceWatchlistPageTestData.YAHOO_FINANCE_WATCHLIST_PAGE_URL);
		System.out.println("YAHOO_FINANCE_WATCHLIST_PAGE_TITLE:"+testDataObject.yahooFinanceWatchlistPageTestData.YAHOO_FINANCE_WATCHLIST_PAGE_TITLE);
		
		System.out.println("YAHOO_FINANCE_INDUSTRIES_PAGE_URL:"+testDataObject.yahooFinanceIndustriesPageTestData.YAHOO_FINANCE_INDUSTRIES_PAGE_URL);
		System.out.println("YAHOO_FINANCE_INDUSTRIES_PAGE_TITLE IS:"+testDataObject.yahooFinanceIndustriesPageTestData.YAHOO_FINANCE_INDUSTRIES_PAGE_TITLE);
	}

	public static JsonParseGetters deserializeNested() throws Exception {
		Gson gson = new Gson();
			//BufferedReader br = new BufferedReader(new FileReader("/Users/madhavareddy/eclipse-workspace/everyday/java_practice_ma/src/com/y18/mar5/x_java_practice/jsonparsedata.json"));
			FileReader br = new FileReader("/Users/madhavareddy/eclipse-workspace/everyday/java_practice_ma/src/com/y18/mar5/x_java_practice/jsonparsedata.json");
			JsonParseGetters td = gson.fromJson(br, JsonParseGetters.class);
 			System.out.println("HELLO");
 			return td;
	}
}
