package com.ControlFlow;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args)
	{
		//for loop: Number of iterations are known
		
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
		
		System.out.println("******************");
		//factorial of number
		 
		 int fact=1;
		 for(int num=5;num>=1;num--)
		 {
			 fact=fact*num;
		 }
		 
		 System.out.println("Factorial of number 5 is: "+fact);
		
			System.out.println("******************");
			
			//while loop: Number of iterations are unknown
			
			//print welcome 10 time
			
			int i=1;
			
			while(i<=10)
			{
				System.out.println("Welcome");
				i++;
			}
		
		
			System.out.println("******************");

		//Interview question:By default condition is always true: infinite
//			for(;;)
//			{
//				System.out.println("Hi");
//			}
//			
			
			//Sum of digits
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number: ");
			int num=sc.nextInt(),rem,result=0;
			
			while(num!=0)//number of digits
			{
				rem=num%10;
				num=num/10;
				result=result+rem;
			}
			
			
			System.out.println("Sum of digits for given number is: "+result);
			
			
			System.out.println("**************************");
			
			System.out.println("Enter a number for reverse");
			int no=sc.nextInt(),r,res=0;
			
			while(no!=0)
			{
				r=no%10;
				no=no/10;
				res=res*10+r;
				
			}
			
			System.out.println("Reverse number is: "+res);
			
			
			System.out.println("************************************");
			
			//prime number is number which is divisible by 1 and itself
			
			int n1=6;
			boolean status=true;
			for(int j=2;j<n1;j++)
			{
				if(n1%j==0)
				{
					status=false;
					break;
				}
			}
			
			if(status==true)
			{
				System.out.println(n1+" is prime number");
			}else
			{
				System.out.println(n1+" is not a prime number");
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
