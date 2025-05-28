package com.OOP.Polymorphism;

public class MainFunctionOverloading
{

	//userdefined
	public static void main(int[] args)//args=arr 
	{
		System.out.println("Main function with int argument is calling...");
		for(int i:args)
		{
			System.out.println(i);
		}

	}
	
	//understood by jvm
	public static void main(String[] args) 
	{
		System.out.println("Main function with string argument is calling...");

		int arr[]= {10,20,30,40,50};
		main(arr);
	}
		

}
