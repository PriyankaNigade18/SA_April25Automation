package com.MethodsInJava;

public class MethodCallTechnique 
{
	
	public void m1()
	{
		System.out.println("M1() is calling.....");
		m2();
	}
	
	
	public void m2()
	{
		System.out.println("M2() is calling.....");
		m3();
		m4();
	}
	
	
	public void m3()
	{
		System.out.println("M3() is calling.....");
		m4();//from instance method we can call static
		//m1();//java.lang.StackOverflowError
	}
	
	public static void m4()
	{
		System.out.println("m4() is static method.....");
		//m1();
		//you cant call any instance method from static method
	}
	
	
	
	
	public static void main(String[] args) 
	{
		MethodCallTechnique obj=new MethodCallTechnique();
		obj.m1();
		
		System.out.println("From main()");
		m4();
		//obj.m2();

	}

}
