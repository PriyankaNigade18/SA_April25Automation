package com.Constructors;

public class ConstructorDemo1
{
	//data
	int id;
	String name;
	
	//default constructor
	public ConstructorDemo1()
	{
		System.out.println("Default constructor is calling!");
		System.out.println("Id is:"+id);
		System.out.println("Name is: "+name);
	}
	
	//Constructor is used to initialized object
	public ConstructorDemo1(int i,String n)//local 
	{
		System.out.println("Parameterized constructor calling...");
		System.out.println("Constructor is used to initialized object");
		//instance data=local data
		id=i;
		name=n;
		
	}
	
	public void show()
	{
		System.out.println("Show() method is calling");
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
	}
	

	public static void main(String[] args) 
	{

		ConstructorDemo1 c1=new ConstructorDemo1();//default constructor
		ConstructorDemo1 c2=new ConstructorDemo1(101,"Sarang");
		c2.show();
		
		ConstructorDemo1 c3=new ConstructorDemo1(102,"Smita");
		c3.show();
		
		
	}

}
