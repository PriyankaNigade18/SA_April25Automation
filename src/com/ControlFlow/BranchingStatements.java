package com.ControlFlow;

public class BranchingStatements 
{
	//break,continue,return
	
	public static String info()
	{
		return "Lets begin in next session Array topic";
	}

	public static void main(String[] args)
	{
		// break: switch/loop
		
		System.out.println("Start.....");
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;//exit from loop
			}else
			{
				System.out.println(i);
			}
		}
		System.out.println("ends....");
		
		System.out.println("**************************");
		
		//continue: skip the certain part of the code and continue execution
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;//skip 5
			}else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("**************************");

		for(int i=1;i<=10;i++)
		{
			if(i>5)
			{
				continue;
			}else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("**************************");
		
		//calling static method
		String msg=info();
		System.out.println(msg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
