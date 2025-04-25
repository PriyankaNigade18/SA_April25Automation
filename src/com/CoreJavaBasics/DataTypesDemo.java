package com.CoreJavaBasics;

public class DataTypesDemo {

	public static void main(String[] args) 
	{
		// Primitive
		
		System.out.println("-----Boolean types------");
		/*
		 * true and false 1bit 
		 * 
		 */
		
		boolean status=true;
		System.out.println("boolean status is: "+status);//true
		
		//boolean status=false;//Duplicate local variable status
		status=false;
		System.out.println("Updated status is: "+status);//false
		
		boolean newStatus=true;
		System.out.println("New status is: "+newStatus);//true
		
		System.out.println("--------Numeric--------------");
		
		/*
		 * character  char '' 2byte
		 * 1.single character
		 * 2.special character
		 * 3.ASCII values for character
		 * 
		 * A-Z = 65 to 90
		 * a-z = 97 to 122
		 * 0 to 9 =48 to 57
		 */
		
		char c1='R';
		char c2='%';
		char c3=99;//Ascii for a character c
		
		System.out.println("Single character: "+c1);
		System.out.println("Special character: "+c2);
		System.out.println("Ascii value 99 for a character: "+c3);//c
		
		char c4=55;//accepting ascii for a character
		System.out.println("Character at ascii 55: "+c4);//7
		
		
		System.out.println("------Integral-->Integer-------");
		
		/*
		 * Integer
		 * -----------
		 * byte-->short-->int--->long
		 * 
		 * by default any number in java is int type
		 * 
		 */
		
		//byte 1byte -128 to 127
		byte b1=125;
		byte b2=-127;
		//Type mismatch: cannot convert from int to byte
		//byte b3=130;
		
		byte b3=-124;
		System.out.println("byte data is: "+b1);
		System.out.println("byte data is: "+b2);
		System.out.println("byte data is: "+b3);
		
		//short 2byte  -32768 to 32767
		
		short s1= 32767;
		short s2=-32768;
		//Type mismatch: cannot convert from int to short
		//short s3=40000;
		
		System.out.println("short data is: "+s1);
		System.out.println("short data is: "+s2);
		
		//int 4byte 
		int i1=50000;
		int i2=988765554;
		//The literal 9999999999999 of type int is out of range 
		//int i3=9999999999999;
		
		System.out.println("int data is: "+i1);
		System.out.println("int data is: "+i2);
		
		//long 8byte -->add suffix (L/l) at the end of that number 
		
		long l1=9999999999999L;
		
		long l2=9987767889L;
		
		long l3=100;
		
		System.out.println("long data is: "+l1);
		System.out.println("long data is: "+l2);
		System.out.println("long data is: "+l3);
		
		
		

		System.out.println("------Integral-->Floating point-------");
		/*
		 * float : 4byte 
		 * 
		 * double: 8byte (default type)
		 */
		
		//float: add suffix value (F/f) at end of the number
		//Type mismatch: cannot convert from double to float
		//float f1=89.76;
		
		float f1=89.76F;
		System.out.println("float data is: "+f1);
		
		//double
		
		double d1=976.5576876856;
		System.out.println("double type is: "+d1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
