package com.ControlFlow;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks=sc.nextInt();
		
		if(marks>=90)
		{
			if(marks>=95 && marks<98)
			{
				System.out.println("A++");
				
			}else if(marks>=98)
			{
				System.out.println("A+++");
			}else
			{
				System.out.println("A");
			}
		}else
		{
			System.out.println("B");
		}
		

	}

}
