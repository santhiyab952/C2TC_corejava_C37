package com.tnsif.daythree;
import java.util.Scanner;
public class Person {

	public static void main(String[] args) 
	{
		
		 Scanner in = new Scanner(System.in);
         String name;
         System.out.println("Enter Name : ");
         name = in.next();
         int age;
         System.out.println("Enter Age : ");
         age = in.nextInt();
         String gender;
         System.out.println("Enter Gender: ");
         gender = in.next();
         int tax;
         System.out.println("Enter Tax : ");
         tax = in.nextInt();
         int income;
         System.out.println("Enter Income : ");
         income= in.nextInt();
         Person p1 = new Person();
         
         p1.setAge(age);
         p1.setGender(gender);
         p1.setIncome(income);
         p1.setTax(tax);
         p1.setname(name);
         System.out.println(p1);
	}

}
         
        
