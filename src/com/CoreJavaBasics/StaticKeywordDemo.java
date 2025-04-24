package com.CoreJavaBasics;




/*
 * Static Keyword
 * ---------------
 * static keyword plays very important role in java
 * It is used for memory management
 * 
 * In class load area of JVM we have metaspace-->Memory allocated for static variable/static method
 * 
 * scope: everywhere inside the class
 * 
 * To call static data we dont need any object
 * 
 * static keyword we can use for
 * -------------------------
 * 1.variable
 * 2.Method
 * 3.static block
 * 
 * 
 */
public class StaticKeywordDemo 
{
	
	static int pinCode=411047;
	
	//instance: object is needed to call
	public void test1()
	{
		System.out.println("This is instance method.....test1()");
	}

	
	//static :Object is not required
	/*
	 * static method within same class without class name you can call
	 * static method outside the class we can call only through class name
	 */
	public static void test2()
	{
		System.out.println("This is static method...test2()");
		
	}
	public static void main(String[] args)
	{
		//static method calling
		test2();
		
		StaticKeywordDemo.test2();
		
		//instance method call-Object
		StaticKeywordDemo s1=new StaticKeywordDemo();
		s1.test1();
		//System.out.println(s1.pinCode);
		
		System.out.println(pinCode);
		
	//The static method test2() from the type StaticKeywordDemo should be accessed in a static way
		//s1.test2();
		
		
		

	}

}








