package com.ControlFlow;

import java.util.Scanner;

public class RealTimeScenario {

	public static void main(String[] args)
	{
		/*
		 * 
		 * primitive data type (Operators)
		 * 10==10
		 * 
		 * String equality
		 * --------------------
		 * String is class in Java (Non primitive)
		 * Any operation on String is possible to complete with the help of methods
		 * 1.equals():It perform exact match and it is case sensitive
		 * 2.equalsIgnoreCase():It perform exact match and it is not case sensitive
		 * 
		 
		
		String s1="Hello";
		String s2="Hello";
		String s3="hello";
		String s4="Hello ";
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equals(s4));//false
		
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s1.equalsIgnoreCase(s3));//true
		System.out.println(s1.equalsIgnoreCase(s4));//false
		
		*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bname=sc.nextLine();
		
		if(bname.equalsIgnoreCase("chrome"))
		{
			System.out.println("Test case is executing on "+bname);
		}
		else if(bname.equalsIgnoreCase("edge"))
		{
			System.out.println("Test case is executing on "+bname);

		}else if(bname.equalsIgnoreCase("firefox"))
		{
			System.out.println("Test case is executing on "+bname);

		}else
		{
			System.out.println("Please Enter valid browser name!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
