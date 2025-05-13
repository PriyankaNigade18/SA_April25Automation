package com.ControlFlow;

public class LoopDemo {

	public static void main(String[] args)
	{
		// Print Hello statement 5 times
		
		for(int count=1;count<=5;count++)
		{
			System.out.println("Hello");
		}
		
		System.out.println("******************");
		
		//Print 1 to 10 numbers
		
		for(int i=1;i<=10;i++)
		{
			
			System.out.println(i);
		}
		
		System.out.println("******************");
		//print 10 to 1
		
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		System.out.println("******************");
		//sum of all natural number up to 100
		//1+2+3+4+....+100=5050
		
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum=sum+i;
		}
		
		System.out.println("Sum of 100 natural numbers is: "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
