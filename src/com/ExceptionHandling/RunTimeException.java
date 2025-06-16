package com.ExceptionHandling;

import java.util.Scanner;

public class RunTimeException {

	public static void main(String[] args)
	{
		String s1="100**";
		System.out.println(s1+100);//100100
		//string to integer
		int num=Integer.parseInt(s1);
		System.out.println(num+100);//200
		
		
		
		
		
		/*
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any index between 0 to 5");
			int index=sc.nextInt();
			
			int arr[]= {10,20,30,40,50,60};	
			
			System.out.println(arr[index]);//ArrayIndexOutOfBoundsException
			
			
			
			
			
			/*
			System.out.println("Enter two numbers");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			System.out.println("Addition is: "+(num1+num2));
			System.out.println("Subtraction is: "+(num1-num2));
			System.out.println("Division is: "+(num1/num2));//ArithmeticException
			System.out.println("Multiplication is: "+(num1*num2));*/
	}

}
