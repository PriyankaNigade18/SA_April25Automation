package com.OOP.Polymorphism;

public class CompileTimePoly {

	/*
	 * Method overloading(Compile time polymorphism)
	 * -----------------------
	 * Method will be overloaded only and only when method has same name
	 * but different signature and method declared in same class
	 * 
	 * 1.Number of Arguments
	 * 2.Different types of Arguments
	 * 3.Change order of Arguments
	 * 
	 * Constructor overloading is possible but not overriding
	 * Operator overloading is possible in Java only for one operator (+)
	 * Main() overloading is possible but technically we don't need it
	 * 
	 */
	
	public void add()//0 parameter
	{
		int a=100,b=20;
		System.out.println("Addition is: "+(a+b));
		
	}
	
	//1.Number of Arguments
	public void add(int a,int b)//2 parameter
	{
	System.out.println("Addition is: "+(a+b));
	}
	
	public void add(int a,int b,int c)//3 parameter
	{
	System.out.println("Addition is: "+(a+b+c));
	}
	
	//2.Different types of Arguments
	public void add(double a,int b)//2 parameter
	{
	System.out.println("Addition is: "+(a+b));
	}
	
	//3.change order of arguments
	public void add(int a,double b)//2 parameter
	{
	System.out.println("Addition is: "+(a+b));
	}
	
	
	//constructor overloading
	CompileTimePoly()
	{
		System.out.println("Default constructor is calling.....");
	}
	
	
	CompileTimePoly(int id)
	{
		System.out.println("Parameterized constructor is calling....."+id);
	}
	
	
	CompileTimePoly(String name)
	{
		System.out.println("Parameterized constructor is calling....."+name);
	}
	
	CompileTimePoly(int id,String name)
	{
		System.out.println("Parameterized constructor is calling....."+id+" : "+name);
	}
	
	CompileTimePoly(String name,int id)
	{
		System.out.println("Parameterized constructor is calling....."+name+" : "+id);
	}
	
	public static void main(String[] args) 
	{

		CompileTimePoly c1=new CompileTimePoly();
		c1.add();
		c1.add(100,9990);
		c1.add(100.22,900);
		c1.add(20,38.780);
		c1.add(20,38,4560);
		
		CompileTimePoly c2=new CompileTimePoly("Parag",99);
		
		

	}

}
