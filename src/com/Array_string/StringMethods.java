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
public class StringMethods {

	public static void main(String[] args)
	{
		
		//length()
		String s1="Hello All";
		System.out.println("Length is: "+s1.length());//9
		
		//To covert string toLowerCase() toUpperCase()
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//equality 1.equals() 2.equalsIgnoreCase()
		String s2="Hello All";
		String s3="hello all";
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equalsIgnoreCase(s3));//true
		
		//charAt(index):return character at index
		System.out.println(s1.charAt(7));//l
		//wrong indexing
		//System.out.println(s1.charAt(10));//StringIndexOutOfBoundsException
		
		//indexOf(char):Returns the index within this string of the first occurrence of the specified character
		System.out.println(s1.indexOf('l'));//2
		
		System.out.println(s1.indexOf('l',4));//7
		
		//lastIndex
		System.out.println(s1.lastIndexOf('l'));//8
		
		System.out.println(s1.indexOf('l',8));//8
		
		//trim(): ignore white space before and after the string
		
		String s4="        Welcome  all            ";
		System.out.println(s4);
		System.out.println(s4.trim());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
