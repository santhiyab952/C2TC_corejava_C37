package com.tnsif.daytwo;

public class operatores {

	public static void main(String[] args) 
	
	{
		int a =20;
		int b =30;
		
		int x =10;
		System.out.println("a and b value before the operations:"+a+ " " +b);
		
		++a;         //++a= a+1= 20+1=21
		int c=++a + b;
		System.out.println("c value: "+c);
		
		//Ternary Operator
		x=(10==x)?1:0;
		System.out.println(x);
		}


	}


