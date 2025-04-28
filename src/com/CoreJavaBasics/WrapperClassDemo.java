package com.CoreJavaBasics;

/*
 * Wrapper class is predefined class in java
 * Help to convert any primitive to Object
 * 
 * Object to primitive
 * Primitive to Object
 * 
 * byte      ---> Byte
 * short    --->Short
 * int     ---->Integer
 * long   ----->Long
 * float------->Float
 * char-------->Character
 * double----->Double
 * boolean----->Boolean
 * 
 * 
 * 
 * 
 * 
 */
public class WrapperClassDemo {

	public static void main(String[] args) 
	{

		//primitive to object: WrapperClass.valueOf()
		
		//int to Integer
		int x=100;
		Integer obj1=Integer.valueOf(x);
		System.out.println(obj1);
		
		//double--->Double
		double d=887665.68999;
		Double dobj=Double.valueOf(d);
		System.out.println(dobj);
		
		//char ---->character
		char c='A';
		Character cobj=Character.valueOf(c);
		System.out.println(cobj);
		
		//Object to primitive:intValue(),floatValue(),doubleValue
			
		Integer i1=879676;//Object
		int a1=i1.intValue();
		System.out.println(a1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
