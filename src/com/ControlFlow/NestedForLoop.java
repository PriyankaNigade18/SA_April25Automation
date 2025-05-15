package com.ControlFlow;

public class NestedForLoop {

	public static void main(String[] args) 
	{
		// print table of any number 2
		
		int num=4;
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}

		System.out.println("******************************");
		
		//Print 1 to 10 tables
		for(int no=1;no<=10;no++)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.print(no*i+"\t");//\t will add tab space
			}
			System.out.println();//next row
		}
		
		System.out.println("******************************");

		//row-->cell-->value
		
		for(int r=1;r<=4;r++)//row
		{
			for(int c=1;c<=4;c++)//cell
			{
				System.out.print("*"+" ");
			}
			//next row
			System.out.println();
		}
		
		
		System.out.println("******************************");

		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
