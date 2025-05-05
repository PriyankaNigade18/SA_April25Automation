package com.MethodsInJava;

import java.util.Scanner;

public class RuntimeParameterPassingDemo1
{
	public void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}

	public int sub(int a,int b)
	{
		return a-b;
	}
	
	public static void main(String[] args) 
	{

		RuntimeParameterPassingDemo1 r1=new RuntimeParameterPassingDemo1();
		
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		r1.add(num1,num2);
		
		int result=r1.sub(num1,num2);
		System.out.println("Subtraction is: "+result);
		

	}

}
