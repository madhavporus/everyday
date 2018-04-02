package com.y18.mar5.x_java_practice.abstracts;

public class ClientEngagement {
	
	
	String clientName;
	double noOfWorkHours;
	double anticipatedRevenue;
	
	public ClientEngagement(String iclientName, double inoOfWorkHours, double ianticipatedRevenue) {
		this.clientName = iclientName;
		this.noOfWorkHours = inoOfWorkHours;
		this.anticipatedRevenue = ianticipatedRevenue;
	}
	
	public String getClientName() {
		return clientName;
	}
	
	public double getWorkHours() {
		return noOfWorkHours;
	}
	
	public double getanticipatedRevenue() {
		return anticipatedRevenue;
	}
}
