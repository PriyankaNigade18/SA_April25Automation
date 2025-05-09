package com.ControlFlow;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) 
	{
		//IfElse: true/false both condition
		
		//validate age for voting age>=18
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are adult");
		}
		else
		{
			System.out.println("You are teenager");
		}
		
		
		System.out.println("*****************************");
		
		/*
		 * accept two number and test number is greater or lesser
		 */
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc2.nextInt();
		int num2=sc2.nextInt();
		
		
		if(num1>num2)
		{
			System.out.println(num1+" is greater than "+num2);
		}else
		{
			System.out.println(num2+" is greater than "+num1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
