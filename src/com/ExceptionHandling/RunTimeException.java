package com.ExceptionHandling;

import java.util.Scanner;

public class RunTimeException {

	int id=101;
	
	public static void main(String[] args)
	{
		
		RunTimeException r1=new RunTimeException();
		RunTimeException r2=null;
		System.out.println(r1.id);
		try {
		System.out.println(r2.id);//NullPointerException
		}catch(NullPointerException n)
		{
			System.out.println("Check object is null!.."+n.getMessage());
		}
		
		
		System.out.println("-------------------------");
		
		String s1="100sadas";
		System.out.println(s1+100);//100100
		//string to integer
		try {
		int num=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num+100);//200
		}catch(Exception e)
		{
			System.out.println("String is not convertable to integer do enter it again...");
		}
		
		
		System.out.println("-------------------------");
		
		
		
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any index between 0 to 5");
			int index=sc.nextInt();
			
			int arr[]= {10,20,30,40,50,60};	
			try {
			System.out.println(arr[index]);//ArrayIndexOutOfBoundsException
			}catch(ArrayIndexOutOfBoundsException a)
			{
				System.out.println("Please enter appropriate index number from 0 to 5");
			}
			
			System.out.println("---------------------------");
			
			
			Scanner sc2=new Scanner(System.in);
			System.out.println("Enter two numbers");
			int num1=sc2.nextInt();
			int num2=sc2.nextInt();
			System.out.println("Addition is: "+(num1+num2));
			System.out.println("Subtraction is: "+(num1-num2));
			try {
			System.out.println("Division is: "+(num1/num2));//ArithmeticException
			}catch(ArithmeticException g)
			{
				System.out.println("Please use number other than 0");
			}
			System.out.println("Multiplication is: "+(num1*num2));
	}

}
