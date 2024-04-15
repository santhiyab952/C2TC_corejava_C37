package com.santhiyab.Assignment2;

import java.util.Scanner;

public class Student_Details 
{
	public static void main(String[] args) 
	{
		Scanner sr =new Scanner (System.in);
	    System.out.println("enter your Fullname_with_initial:");
	    String FullName_with_initial=sr.nextLine();
	    
	    System.out.println("enter your RollNo:");
	    String RollNo=sr.nextLine();
	   
	    System.out.println("enter your Grade:");
	    String Grade=sr.nextLine();
	 
	    System.out.println("enter your Percentage:");
	    int Percentage=sr.nextInt();
	 
	    
	    System.out.println(FullName_with_initial);
	    System.out.println(RollNo);
	    System.out.println(Grade);
	    System.out.println(Percentage);
	    sr.close();
	}
	    
	  
	
	

}
