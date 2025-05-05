package com.MethodsInJava;

public class CompileTimeParameterPassing
{
	//static code
	public void add()// 0 parameters Local
	{
		int a=100,b=200;//local variable
		System.out.println("Addition is: "+(a+b));
	}
	
	//dynamic code
	public void sub(int a,int b)//2 parameters local parameter a=1000 b=200
	{
		System.out.println("Subtraction is: "+(a-b));
	}
	
	//method definition
	public void info(String msg)//1 parameter local
	{
		System.out.println(msg);
	}

	public void search(String pname,int price)
	{
		System.out.println("Product name is: "+pname+" with price: "+price);
	}

	public static void main(String[] args) 
	{
		
		//calling function
		CompileTimeParameterPassing c1=new CompileTimeParameterPassing();
		
		c1.search("Mobile",50000);
		c1.add();
		
		/*
		 * Parameter: represent variable
		 * Argument: while calling any method/constructor we are passing real data
		 * thats called argument
		 */
		//calling sub method and passing two arguments method
		c1.sub(1000,200);
		
		c1.info("Hello All!");

		c1.search("laptop",90000);


	}

}
