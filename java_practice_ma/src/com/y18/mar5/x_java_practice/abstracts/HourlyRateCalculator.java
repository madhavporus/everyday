package com.y18.mar5.x_java_practice.abstracts;

import com.y18.mar5.x_java_practice.abstracts.ClientEngagement;

public class HourlyRateCalculator extends RevenueCalculator {
	public static final double HOURLY_RATE=68;
	public static double hourlyRate;
	
	public HourlyRateCalculator(double iHourlyRate){
		this.hourlyRate = iHourlyRate;
	}
	
	
	
	@Override
	public double calculate(final ClientEngagement oclientEngagement) {
		
		
		double price;
		price = HOURLY_RATE * oclientEngagement.getWorkHours();
		
		return price;
	}
	
	public String getNameOfCal() {
		//return "@hourly rate";
		return " @hourly rate of $"+hourlyRate;
	}

}
