package com.ControlFlow;

import java.util.Scanner;

public class SwicthCaseDemo2 {

	public static void main(String[] args) 
	{
		
		/*
		 * To convert string
		 * -------------------
		 * 1.toUpperCase()
		 * 2.toLowerCase()
		 */
		
		//Key =value
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bname=sc.nextLine();
		
		String key=bname.toLowerCase();
		
		switch (key)
		{
		case "chromium":
		case "chrome":
				System.out.println("Test case is executing on "+key);
				break;
		case "edge":
			System.out.println("Test case is executing on "+key);
			break;
		case "firefox":
			System.out.println("Test case is executing on "+key);
			break;

		default:
			System.out.println("Please enter correct browser name!");
		}
		
		sc.close();
		

	}

}
