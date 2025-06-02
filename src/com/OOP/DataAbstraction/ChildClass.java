package com.OOP.DataAbstraction;

public class ChildClass extends AbstractClass
{

	@Override
	public void show()
	{

		System.out.println("AbstractClass----ChildClass Implemented...show()");
	}
	
	public void display()
	{
		System.out.println("ChildClass......display()");
	}
	
	
	public static void main(String[] args) 
	{
		
		System.out.println("Scenario1: Child class ref and Child class object: Parent+child");
		
		ChildClass c1=new ChildClass();
		c1.accept();//inherited
		c1.display();//individual
		c1.show();//inherited abstract method
		
		System.out.println("Scenario 2: Parent class ref and Parent class object: Invalid");

		//AbstractClass a1=new AbstractClass();//Cannot instantiate the type AbstractClass
		
		System.out.println("Scenario 3: Parent class ref and child class object: Parent");
		
		AbstractClass a1=new ChildClass();
		a1.accept();
		a1.show();//updated
		
		
		System.out.println("Scenario 3: child class ref and parent class object: Invalid");
		
		//ChildClass c2=new AbstractClass();////Cannot instantiate the type AbstractClass
		


	}


	

}
