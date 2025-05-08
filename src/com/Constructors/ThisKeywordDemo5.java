package com.Constructors;

/* this keyword
-----------------
 this keyword refer current class object
 current class instance variable and current class instance method
 
 this can be passed as an argument in the Constructor call.


*/


 class A
{
	
	A(ThisKeywordDemo5 obj)
	{
		System.out.println("This is constructor from A class");
		System.out.println(obj.price);
	}
}


public class ThisKeywordDemo5
{
	int price=900000;

	public ThisKeywordDemo5() 
	{
		this("hello");
		//calling constructor of A class
		A a1=new A(this);
		
		System.out.println("Default constaructor.....");
	}
	
	public ThisKeywordDemo5(String msg) 
	{
		System.out.println("Parameterized constructor.....:"+msg);
	}
	
	
	
	public static void main(String[] args) 
	{
		ThisKeywordDemo5 t1=new ThisKeywordDemo5();
		

	}

}
