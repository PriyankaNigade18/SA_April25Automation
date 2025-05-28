package com.OOP.Inheritance;


class A
{
	public void m1()
	{
		System.out.println("M1 is calling....");
	}
}

class B extends A //Single level inheritance where B is child and A is parent
{
	public void m2()
	{
		System.out.println("M2 is calling....");
	}
}


public class InheritanceDemo {

	public static void main(String[] args)
	{

		//A class reference and A class object
		A a1=new A();
		a1.m1();
		
		
		System.out.println("*************************");
		
		//B class reference and B class object
		B b1=new B();
		b1.m2();
		b1.m1();

	}

}
