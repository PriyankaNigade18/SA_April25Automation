package com.CoreJavaBasics;


/*
 * Type Casting
 * ----------------
 * Type conversion of one type of data into other type
 * Type casting is only possible if type is compatible and size also
 * 
 * 1.primitive to primitive
 * 2.primitive to Object
 * 3.Object to primitive
 * 
 * 1.primitive to primitive
 * --------------------------
 * 	1.Implicit
 * -----------------
 * It is Automatic conversion
 * taken care by JVM
 * 
 * small size data---->large size
 * 
 * 2.Explicit
 * ---------------------
 * It is manual and forcefull conversion
 * For explicit we need casting operator
 */
public class TypeCasting {

	public static void main(String[] args)
	{
		//implicit:small size---Large size
		//byte-->short--->int-->long-->float-->double
		
		int x=100;//4byte
		long l=x;//8byte <--- 4byte
		
		System.out.println("int to long conversion: "+l);//long type data
		
		int y=877655548;
		long l2=y;
		System.out.println("int to long conversion: "+l2);//long type data

		char c1='z';//2byte 
		int i1=c1;//4byte<----2byte
		
		//z ascii value 122
		System.out.println("char to int: "+i1);//122
		
		char c2=65;//it store ascii 65 for char A into c2
		int i2=c2;
		System.out.println("char to int: "+i2);//65
		
			
		int p=786;
		float f1=p;
		System.out.println("int to float conversion: "+f1);//786.0
		
		long l3=788765L;//8byte
		float f2=l3;//4byte
		
		
		System.out.println("long to float conversion: "+f2);
		
		System.out.println("--------------------Explicit Casting----------------");
		//large size data----->small size data
		//double-->float--->long--->int-->short-->byte
		
		double d2=567899.78674545;//8byte
		System.out.println("double data is: "+d2);
		int a1=(int) d2;//Type mismatch: cannot convert from double to int
		System.out.println("double to int conversion: "+a1);
		
		
		int a2=120;//4byte
		//Type mismatch: cannot convert from int to char
		char c3=(char)a2;//2byte
		System.out.println("int 120 to character type: "+c3);//x
		
		
		long l4=877655443322212L;
		//Type mismatch: cannot convert from int to char
		int a3=(int)l4;
		System.out.println("long data to int: "+a3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
