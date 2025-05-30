package com.OOP.Inheritance;

public class TestParentChild {

	public static void main(String[] args) 
	{
		/*
		 * Run time polymorphism
		 * -------------------------
		 * 1.Classes must be in IS-A relation
		 * 2.When both the classes have same name method and same signature then
		 * Child class override parent class method
		 * (Update result only by child)
		 */

		System.out.println("Scenario1: Child class ref and child class object");
		
		Child c1=new Child();
		c1.color();//Blue
		
		System.out.println("Scenraio2: Parent class ref and parent class object");
		
		Parent p1=new Parent();
		p1.color();//Red
		
		System.out.println("Scenario3: Parent class ref and child class object");
		
		Parent p2=new Child();
		
		p2.color();//Blue
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
