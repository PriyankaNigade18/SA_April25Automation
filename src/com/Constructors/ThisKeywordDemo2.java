package com.Constructors;



/*
 * this keyword
	 * -----------------
	 * this keyword refer current class object
	 * current class instance variable and current class instance method
 * 2.this can be used to invoke current class method (implicitly)

 */
public class ThisKeywordDemo2
{
	public void m1()
	{
		System.out.println("M1 is calling.....");
		//m2();
		this.m2();
	}
	
	public void m2()
	{
		System.out.println("M2 is calling.....");
		this.m3();
	}
	
	
	public void m3()
	{
		System.out.println("M3 is calling.....");
	}

	public static void main(String[] args)
	{
		ThisKeywordDemo2 t1=new ThisKeywordDemo2();
		t1.m1();



	}

}
