package com.y18.mar5.x_java_practice.abstracts;

public class FixedFeeCalculator extends RevenueCalculator {
	public static double FIXED_RATE = 71;
	
	
	public FixedFeeCalculator(double iFIXED_RATE) {
		this.FIXED_RATE = iFIXED_RATE;
		
	}
	@Override
	public double calculate(ClientEngagement oClientEngagement) {
		// TODO Auto-generated method stub
		double price;
		 price = FIXED_RATE * oClientEngagement.getWorkHours();
		 return price;
		 
	}
	
	public String getNameOfCal() {
		return " @fixed rate of $"+FIXED_RATE;
	}

}
