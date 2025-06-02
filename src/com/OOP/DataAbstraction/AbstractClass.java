package com.OOP.DataAbstraction;

public abstract class AbstractClass
{
	
	/*
	 * Class declare with abstract keyword is called abstract class
	 * Abstract class can have fully implemented method(Method with body) and
	 * non implemented method(method without body/abstract method)
	 * Abstract method is declare with abstract keyword
	 * 
	 * to implement abstract method we need child class
	 * partial abstraction support
	 */
	
	//fully implemented method
	public void accept()
	{
		System.out.println("AbstractClass.....Fully impemented method-Accept()");
	}
	
	
	//non implemented method/abstract
	
	public abstract void show();
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//AbstractClass a1=new AbstractClass();//Cannot instantiate the type AbstractClass
		

	}

}
