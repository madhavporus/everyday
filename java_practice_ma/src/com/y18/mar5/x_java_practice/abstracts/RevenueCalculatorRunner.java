package com.y18.mar5.x_java_practice.abstracts;

import com.y18.mar5.x_java_practice.abstracts.RevenueCalculator.*;
import static com.y18.mar5.x_java_practice.abstracts.HourlyRateCalculator.HOURLY_RATE;
import static com.y18.mar5.x_java_practice.abstracts.FixedFeeCalculator.FIXED_RATE;

import java.util.Arrays;
import java.util.List;

import com.y18.mar5.x_java_practice.abstracts.ClientEngagement;

public class RevenueCalculatorRunner {
	
	public static void main(String args[]) {
		final List<ClientEngagement> oClientEngagements = Arrays.asList(
				new ClientEngagement("Apple",40,40000),
				new ClientEngagement("Google",30,30000),
				new ClientEngagement("Amazon",20,20000)
				);
		
		printRevenueOfAllCLients(oClientEngagements, new FixedFeeCalculator(FIXED_RATE));
		System.out.println("--------------");
		printRevenueOfAllCLients(oClientEngagements, new HourlyRateCalculator(HOURLY_RATE));
	}
	
	public static void printRevenueOfAllCLients(List<ClientEngagement> ioClientEngagements, RevenueCalculator RC) {
		int i= 1;
		RevenueCalculator r;
		for(ClientEngagement cEL:ioClientEngagements) {
			System.out.println(i+")"+cEL.getClientName()+"'s"+" total revenue" +RC.getNameOfCal()+" is: "+RC.calculate(cEL));
			i=i+1;
		}
	}	
}
