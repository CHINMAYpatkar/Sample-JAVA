package com.Demo.Java1;

public class Merc{
	int a = 30;
	float b = 3.4f;
	double c;
	String name="MerceAMG300";
	double avg =30.3;
	public void carIsrunning(){
		c=a+b;
		System.out.println("The "+name+" is running");
		System.out.println("The average of the vehicle is: "+avg);
		System.out.println("There is some modification done to improve the average of the vehicle");
		System.out.println("The average of the vehicle after modification is: "+c);
	}
	
}
