package com.y18.mar5.x_java_practice.abstractsone;

import java.io.BufferedReader;
import java.io.FileReader;

import com.google.gson.Gson;
import com.y18.mar5.x_java_practice.abstractsone.ClientEngagementsConstructors;


public class FixedFeeCaliculatorCls extends RevenueCaliculatorAbstCls {
	double hrsworked, rate;
	
public double calulator(ClientEngagementsConstructors eEngConst) {
	System.out.println("Client Name:"+eEngConst.clientName);
	double price;
	price = eEngConst.fixed_Rate * eEngConst.hours_Worked;
			
	return price;
}
	

}
