package com.MethodsInJava;


/*
 * return keyword
 * -------------------
 * return keyword help to return any data/output from the method
 * whenever we are using return keyword then return type of that method
 * should be same like your data
 * return information returns to the calling function
 * return statement is always last statement of your method
 * 
 */

public class ParameterPassingWithReturnKeyword
{
	
	public int add(int a,int b)//2 parameters local
	{
		//System.out.println("Addition is: "+(a+b));
//		int c=a+b;
//		return c;
		return a+b;//control goes to line 33
	}
	
	public String search(String pname,int price)
	{
		
		//return pname,price; wrong approach
		String msg="Productname is: "+pname+" : Product price is: "+price;
		return msg;
	}
	
	
	public boolean testStatus(boolean status) 
	{
		return status;
		
	}
	

	public static void main(String[] args) 
	{
		ParameterPassingWithReturnKeyword p1=new ParameterPassingWithReturnKeyword();
		//calling method
//		int result=p1.add(100,240);
//		System.out.println("Addition is: "+result);
		

		System.out.println("Addition is: "+p1.add(1000,9900));
		
		String res=p1.search("Mobile",80000);
		System.out.println(res);
		
		System.out.println("Status is: "+p1.testStatus(false));
		

	}

}
