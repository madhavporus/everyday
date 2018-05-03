package com.y18.mar5.x_java_practice.abstractsone;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.y18.mar5.x_java_practice.abstractsone.RevenueCaliculatorAbstCls;
import com.y18.mar5.x_java_practice.abstractsone.HourlyRateCaliculatorCls;
import com.y18.mar5.x_java_practice.abstractsone.FixedFeeCaliculatorCls;

public class RevenueCaliculatorRunnerCls{	
	public static void main(String args[]) {
		try {
			final List<ClientEngagementsConstructors> listOfClients = Arrays.asList(
			new ClientEngagementsConstructors("apple"),
			new ClientEngagementsConstructors("amazon"),
			new ClientEngagementsConstructors("google")
			);
		
			System.out.println("Revenue by client with HOURLY_RATE:");
			System.out.println("------------------------------------------------");
			totalRevenues(listOfClients, new HourlyRateCaliculatorCls());
			System.out.println();
			System.out.println("Revenue by client with FIXED_RATE:");
			System.out.println("------------------------------------------------");
			totalRevenues(listOfClients, new FixedFeeCaliculatorCls());
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		   
	}
	
	
	public static void totalRevenues(List<ClientEngagementsConstructors> clnts, RevenueCaliculatorAbstCls cal){
		double total =0;
		for(ClientEngagementsConstructors cec: clnts) {
			total = cal.calulator(cec);
			System.out.println("Total:"+total);
		}
		
	}
	
	
	
	
}


















//*//-------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------

/*		
		public static void calHash() throws Exception {
			ClientEngagementsConstructors td = getTestData();
	  		//ClientengagementsC al = td.Clientengagements;
			//AppleC ac = al.Apple;
			
			Map<Integer,Object> map=new HashMap<Integer, Object>();
			
		     
			for (Map.Entry<Integer,Object> entry : map.entrySet()) {
			    Integer key = entry.getKey();
			    Object value = entry.getValue();
			    System.out.println("KEY-VAL"+key);
			    System.out.println("KEY-VAL"+value);
			    // ...
			}
			
		     System.out.println("HelloOO");
			 Set<Integer> keySetGet= map.keySet();
		}
//-------------------------------------------------------------------------------------		
		public static void cal1() throws Exception{
			try {            
		    	ClientEngagementsConstructors td = getTestData();
		  		ClientengagementsC al = td.Clientengagements;
		  		//x.Amazon.fixed_rate;
		  		//td.Clientengagements.Amazon.fixed_rate;
		  		System.out.println("MMM:"+al.getClass().getDeclaredFields().length);
		         Field[] fields = al.getClass().getDeclaredFields();
		         //System.out.println("fields: "+ fields);
		         for(int i = 0; i < fields.length-1; i++) {
		            System.out.println("Field = " + fields[i].getName());
			  		List<ClientengagementsC> alx = new ArrayList<ClientengagementsC>();
			  		for(ClientengagementsC y:alx) {
			  			System.out.println(y.getClass().getDeclaredFields());
			  		}
		         }
		      } catch(Exception e) {
		         System.out.println(e.toString());
		      }
		}
//-------------------------------------------------------------------------------------	
		public static  ClientEngagementsConstructors getTestData() throws Exception {	
			Gson gson = new Gson();
			BufferedReader br = new BufferedReader(new FileReader("/Users/madhavareddy/eclipse-workspace/everyday/java_practice_ma/src/com/y18/mar5/x_java_practice/abstractsone/file.json"));
			ClientEngagementsConstructors td = gson.fromJson(br, ClientEngagementsConstructors.class);
			//double x = td.clientengagements.Amazon.fixed_rate;
			//System.out.println(x);			
			return td;
		}
//-------------------------------------------------------------------------------------	
	public static void calculaterevenue(RevenueCaliculatorAbstCls RC) {
		double price;
		price = RC.cal();
		System.out.println("KKKKKK++++"+price);
	}
//-------------------------------------------------------------------------------------
*/	