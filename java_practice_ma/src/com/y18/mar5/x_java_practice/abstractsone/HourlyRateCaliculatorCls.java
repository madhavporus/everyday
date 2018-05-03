package com.y18.mar5.x_java_practice.abstractsone;



public class HourlyRateCaliculatorCls extends RevenueCaliculatorAbstCls {

	@Override
	public double calulator(ClientEngagementsConstructors eEngConst) {
		// TODO Auto-generated method stub
		
		System.out.println("Client Name:"+eEngConst.clientName);
		double hrsRate = eEngConst.hourly_Rate * eEngConst.hours_Worked;
		
		return hrsRate;
	}
	
	

}
