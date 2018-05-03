
//Source: https://stackoverflow.com/questions/9151619/how-to-iterate-over-a-jsonobject/32412500
package com.y18.mar5.x_java_practice.abstractsone;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class SimpleJson {

	
	public static void main(String args[]) throws Exception, IOException, ParseException {
		
		//getJSONDATA();
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("/Users/madhavareddy/eclipse-workspace/everyday/java_practice_ma/src/com/y18/mar5/x_java_practice/abstractsone/file.json"));
		JSONObject jsonObject = (JSONObject) obj;
		printJsonObject(jsonObject);
		
	}
	
	public static void printJsonObject(JSONObject jsonObj) {
		
		 
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
	            printJsonObject((JSONObject)keyvalue);
	    }
	}
	
	
	
	
	public static void getJSONDATA() {
		
		JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader("/Users/madhavareddy/eclipse-workspace/everyday/java_practice_ma/src/com/y18/mar5/x_java_practice/abstractsone/file.json"));

            JSONObject jsonObject = (JSONObject) obj;
            //System.out.println(jsonObject);
            Set name = jsonObject.entrySet();
            //System.out.println("Set is: "+name);
            int x = name.size();
            System.out.println("Size is:"+x);
            
            //JSONArray msg = (JSONArray) jsonObject.get("Clientengagements");
            //Map<String,JSONObject> gfg = new HashMap<String,JSONObject>();
            
            Iterator<JSONObject> iterator = name.iterator();
            
            
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            
            

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
	}
	
	
}
