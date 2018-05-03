//AAAA
package com.y18.mar5.x_java_practice.abstractsone;
	import java.io.FileReader;
	import java.io.IOException;
	import org.json.simple.JSONArray;
	import org.json.simple.JSONObject;
	import org.json.simple.parser.JSONParser;

	public class ClientEngagementsConstructors {
		String appUrl, userName, password,clientName;
		Long fixed_Rate,hourly_Rate,hours_Worked; 

		public ClientEngagementsConstructors(String clientName) throws IOException, Throwable {
			JSONParser parser = new JSONParser();
			
				Object obj = parser.parse(new FileReader("/Users/madhavareddy/eclipse-workspace/everyday/java_practice_ma/src/com/y18/mar5/x_java_practice/jsondatastore/arraykind.json"));
				JSONObject jsonObj = (JSONObject) obj;
				
				 this.appUrl = (String) jsonObj.get("appURL");				
				 this.userName = (String) jsonObj.get("userID");
				 this.password = (String) jsonObj.get("pwd");
				
				//HashMap<String, Object> kayValuePair = new HashMap<String, Object>();
				//Loop through Array of data
				JSONArray dataArr = (JSONArray) jsonObj.get("clientEngagements");
				int x = dataArr.size();
				for(int i=0;i<x;i++) {
					
					//System.out.println(dataArr.get(i));
					JSONObject obj2=(JSONObject) dataArr.get(i); 
					String Clientname = (String) obj2.get("name");
					
					if(clientName.equalsIgnoreCase(Clientname)) {
						this.clientName = Clientname;
						//System.out.println("Name is:"+Clientname);
						this.fixed_Rate = (Long) obj2.get("fixedRate");
						//System.out.println("Fixed Rate is:"+fixed_Rate);
						this.hourly_Rate = (Long) obj2.get("hourlyRate");
						//System.out.println("Hourly Rate is:"+hourly_Rate);
						
						this.hours_Worked = (Long) obj2.get("hoursWorked");
						//System.out.println("hours_Worked is:"+hours_Worked);
					} else {
						continue;
					}
					
				}
			
		}
	} // END OF CLASS
//------------------------------------- ------------------------------------- -------------------------------------

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//final Long TotalFixedRate = hours_Worked * fixed_Rate;
		
	
	//-------------------
	/*public static void getTestData() throws IOException, ParseException {
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


				System.out.println(obj2.get("hourlyRate"));
				

				

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}*/

