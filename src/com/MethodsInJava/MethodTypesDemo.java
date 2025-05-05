package com.MethodsInJava;

public class MethodTypesDemo
{
	/*
	 * Instance Method
	 * ---------------------
	 * Using object we can call instance method
	 * 
	 * Static method:class level
	 * ---------------------
	 * In Same class without class name 
	 * In different class With class name
	 */
	
	public void accept()
	{
		System.out.println("Instance method.....accept()");
	}

	public static void show()
	{
		System.out.println("Static method....show()");
	}
	
	
	
	public static void main(String[] args)
	{

		show();
		MethodTypesDemo.show();
		
	MethodTypesDemo m1=new MethodTypesDemo();
	m1.accept();
	
	//m1.show();
			
	
		

	}

}
