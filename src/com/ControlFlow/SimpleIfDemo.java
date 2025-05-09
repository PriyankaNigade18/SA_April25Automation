package com.ControlFlow;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args)
	{
		//Simple If: to test one single true condition

		System.out.println("Program started......");
		//validation of year
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");
		int year=sc.nextInt();
		//int year=2026;
		
		//if block
		if(year==2025)
		{
			System.out.println("This is current year: "+year);
		}
		
		
		System.out.println("Program ended......");
	}

}
