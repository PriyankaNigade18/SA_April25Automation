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
 * Static Block
 * ---------------
 * Static block is used to initialize static data
 * First priority goes to static block
 * 
 * 
 */
public class StaticBlock
{

	static int pinCode;
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Main() is calling.......");
		System.out.println(pinCode);

		StaticBlock b1=new StaticBlock();
		b1.test();
	}
	
	
	//static block
		static
		{
			System.out.println("Static block is calling.....");
			pinCode=411047;
			System.out.println(pinCode);
			
			StaticBlock b1=new StaticBlock();
			b1.test();
			
		}
		
		
		public void test()
		{
			System.out.println("This is test() calling....");
			
		}
		

	
}







