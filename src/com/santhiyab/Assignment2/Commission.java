package com.santhiyab.Assignment2;

import java.util.Scanner;

public class Commission 
{
	String Name,Address,commission;
	long PhoneNo;
	double sales_amount;
    Scanner sr=new Scanner(System.in);
 	
 	
 	public void detailsOfEmployee() 
 	{
 	System.out.println("Name of Employee:");
 	Name=sr.nextLine();
 	System.out.println("Address of employee:");
 	Address=sr.nextLine();
 	System.out.println("Phone number:");
 	PhoneNo=sr.nextLong();
 	System.out.println("Sales Amount");
 	sales_amount=sr.nextDouble();
 	
 	}
 	public void calculateCommission() 
 	{
 		if(sales_amount>=100000) 
 			commission="10%";
 		else if(50000>=sales_amount && sales_amount<100000)
 			commission="5%";
 		else if(30000>=sales_amount && sales_amount<50000)
 			commission="3%";
 		else
 			commission="0";
 		System.out.println(" Your Commission is "+commission);
 		
 		
 		
 	}
}
 	