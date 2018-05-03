package com.y18.mar5.x_java_practice.jsondatastore;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TestDataStore {

	public static void main(String[] args) throws IOException, Exception {
		getTestData();
		
		
		//printJsonObject();
	}
	
	
	public static void getTestData() throws IOException, ParseException {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("/Users/madhavareddy/eclipse-workspace/everyday/java_practice_ma/src/com/y18/mar5/x_java_practice/jsondatastore/arraykind.json"));
			JSONObject jsonObj = (JSONObject) obj;
			//System.out.println(jsonObj);
			
			String appUrl = (String) jsonObj.get("appURL");
			System.out.println(appUrl);
			
			String userName = (String) jsonObj.get("userID");
			System.out.println(userName);
			
			String password = (String) jsonObj.get("pwd");
			System.out.println(password);
			
			//Loop through Array of data
			JSONArray dataArr = (JSONArray) jsonObj.get("clientEngagements");
			int x = dataArr.size();
			
			for(int i=0;i<x;i++) {
				//System.out.println(dataArr.get(i));	
				//JSONObject obj2=(JSONObject) dataArr.get(i); -- 
				JSONObject obj2=(JSONObject) dataArr.get(i); 
				System.out.println("======Record#"+i+"==========");
				
				String Clientname = (String) obj2.get("name");
				System.out.println("C.NAME:"+Clientname);
				System.out.println(obj2.get("hoursWorked"));
				//System.out.println(obj2.get("name"));
				//-------------------------------------------------
				
				
				
				//Long rr = (((Long) obj2.get("hoursWorked")) * ((Long) obj2.get("fixedRate")));
				final Long hours_Worked = (Long) obj2.get("hoursWorked");
				System.out.println("C.HOURS:"+hours_Worked);
				
				Long fixed_Rate = (Long) obj2.get("fixedRate");
				System.out.println("Fixed Rate:"+fixed_Rate);
				
				Long TotalFixedRate = hours_Worked * fixed_Rate;
				System.out.println("Total Rate:"+TotalFixedRate);
				
				//int hoursWorkedarApple = obj2.get("hoursWorked");
				
				
				//Double hoursWorkedarApple = (Double) obj2.get("hoursWorked");
				//Double ii = (Double) hoursWorkedarApple;
				
				//System.out.println("C.HOURS:"+hoursWorkedarApple);
				
				//-------------------------------------------------
				
				System.out.println(obj2.get("fixedRate"));
				/*int ddd1 = (int) obj2.get("hoursWorked");
				int ddd2 = (int) obj2.get("fixedRate");*/
				System.out.println(obj2.get("hourlyRate"));
				
				//System.out.println(obj2.get("name")+"'s total revenue is:");
				
				//System.out.println("Total RateKKKKKK:"+(((Long) obj2.get("hoursWorked")) * ((Long) obj2.get("fixedRate"))));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// In case you want to send the JSON obhect to this method and get thelist of all properties.
	public static void printJsonObjectX(JSONObject jsonObj) {
	    for (Object key : jsonObj.keySet()) {
	        //based on you key types
	        String keyStr = (String)key;
	        Object keyvalue = jsonObj.get(keyStr);
	        //Print key and value
	        //System.out.println("key: "+ keyStr + " value: " + keyvalue);
	        if (keyvalue instanceof JSONObject) {
	        	System.out.println(keyStr);
	        }else{
	        	//System.out.println("key: "+ keyStr + " value: " + keyvalue);
	        	System.out.println(keyStr + ":" + keyvalue);
	        }
	        //for nested objects iteration if required
	        if (keyvalue instanceof JSONObject)
	            printJsonObjectX((JSONObject)keyvalue);
	    }
	}
	
	
	public static void getJsonObjectAsListX(JSONObject jsonObj) {
	    for (Object key : jsonObj.keySet()) {
	        //based on you key types
	        String keyStr = (String)key;
	        Object keyvalue = jsonObj.get(keyStr);
	        //Print key and value
	        //System.out.println("key: "+ keyStr + " value: " + keyvalue);
	        if (keyvalue instanceof JSONObject) {
	        	System.out.println(keyStr);
	        }else{
	        	//System.out.println("key: "+ keyStr + " value: " + keyvalue);
	        	System.out.println(keyStr + ":" + keyvalue);
	        }
	        //for nested objects iteration if required
	        if (keyvalue instanceof JSONObject)
	            printJsonObjectX((JSONObject)keyvalue);
	    }
	}
	
	
	
}
