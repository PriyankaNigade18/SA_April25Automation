package com.Array_string;

/*
 * String is class in java from java.lang package
 * String is collection of characters
 * String is immutable class
 * 
 * String declaration ways
 * ---------------------------
 * 1.using literal: string get store into string constant pool of jvm
 * 2.Using new keyword: string get store into heap area of jvm
 * 
 * String constant pool
 * ---------------------------
 * - duplication for string is not allowed
 * - It saves memory
 * 
 */
public class StringDemo1 {

	public static void main(String[] args)
	{
		/*
		 * When we compare Objects id use operator ==
		 * When we compare data use methods: 1.equals() 2.equalsIgnoreCase()
		 */
		
		String s1="Hello";
		
		String s2="Hello";
		
		System.out.println(s1==s2);//id get compare -true
		
		String s3=new String("Hello");
		String s4=new String("Hello");
		
		System.out.println(s3==s4);//false
		
		
		System.out.println(s3.equals(s4));//true
		
		
		//String is Immutable class
		
		s1=s1+"All";
		
		System.out.println(s2==s1);//false
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
