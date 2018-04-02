package com.y18.mar5.x_java_practice;
import com.google.gson.Gson;
public class JsonParseGetters {
	String AppMainURL;
	
	UserTestData userTestData;
	YahooFinanceHomePageTestData yahooFinanceHomePageTestData;
	YahooFinanceWatchlistPageTestData yahooFinanceWatchlistPageTestData;
	YahooFinanceIndustriesPageTestData yahooFinanceIndustriesPageTestData;
	
	class UserTestData{
		String uName;
		int uID;
		String uCountry;
	}
	class YahooFinanceHomePageTestData{
		String YAHOO_FINANCE_HOME_PAGE_URL;
		String YAHOO_FINANCE_HOME_PAGE_TITLE;
	}
	class YahooFinanceWatchlistPageTestData{
		String YAHOO_FINANCE_WATCHLIST_PAGE_URL;
		String YAHOO_FINANCE_WATCHLIST_PAGE_TITLE;
	}
	class YahooFinanceIndustriesPageTestData{
		String YAHOO_FINANCE_INDUSTRIES_PAGE_URL;
		String YAHOO_FINANCE_INDUSTRIES_PAGE_TITLE;
	}
}
