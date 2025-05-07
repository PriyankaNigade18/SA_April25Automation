package com.Constructors;

/*
 * this keyword
	-----------------
	 this keyword refer current class object
	 current class instance variable and current class instance method
	 
	 this() can be used to invoke current class constructor.
	 Constructor call must be the first statement in a constructor

 */
public class ThisKeywordDemo3 
{
	//c1
	ThisKeywordDemo3()
	{
		this(10,"Bye");//c3
		System.out.println("Default constructor calling.....");
	}
	
	//c2
	ThisKeywordDemo3(String msg)
	{
		//call default constructor: this()
		//this(101,"parag");
		this();
		System.out.println("Parameterized constructor is calling!: "+msg);
		//this();//Constructor call must be the first statement in a constructor
	}
	//c3
	ThisKeywordDemo3(int id,String name)
	{
		System.out.println("id is: "+id+" name is: "+name);
		
	}
	
	public static void main(String[] args)
	{

		//ThisKeywordDemo3  t1=new ThisKeywordDemo3 ();
		
		ThisKeywordDemo3  t2=new ThisKeywordDemo3 ("Hello All!");
		
		
		
		

	}

}
