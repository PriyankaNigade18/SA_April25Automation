package com.MethodsInJava;

import java.util.Scanner;

public class Assignment5
{
	public void details(String fname,String lname,char gen,int age,long phno)
	{
		System.out.println("***********User details are**********");
		System.out.println("User first name is: "+fname);
		System.out.println("User last name is: "+lname);
		System.out.println("User gender is: "+gen);
		System.out.println("User age is: "+age);
		System.out.println("User phone number is: "+phno);
	}

	public static void main(String[] args)
	{

		Assignment5 a1=new Assignment5();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String fname=sc.nextLine();
		
		System.out.println("Enter your last name");
		String lname=sc.nextLine();
		
		System.out.println("Enter your gender(f/m)");
		String data=sc.nextLine();
		char gen=data.charAt(0);
		
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		System.out.println("Enter your phone number");
		long phno=sc.nextLong();
		
		a1.details(fname, lname, gen, age, phno);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
