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

class C extends B //Multilevel inheritance C is child and B is parent
{
	public void m3()
	{
		System.out.println("M3 is calling.....");
	}
}

class D extends A //D is child and A is parent: Hierarchical inheritance 
{
	public void m4()
	{
		System.out.println("M4 is calling....");
	}
}




public class InheritanceDemo {

	public static void main(String[] args)
	{

		//A class reference and A class object
		System.out.println("Scenario1: Parent class ref and parent class object: only parent method");
		
		//B is child and A is parent:single level
//		A a1=new A();
//		a1.m1();//individual
	
		//C is child and B is parent & B is child for A:Multilevel 
//		B b1=new B();
//		b1.m1();//inherited
//		b1.m2();//individual
		
		//D is child and A is parent and A is parent for B class: Hierarchical inheritance 
		A a1=new A();
		a1.m1();
		
		
		System.out.println("*************************");
		
		//B class reference and B class object
		System.out.println("Scenario2: Child class ref and child class object: Perent+Child");
		//B is child and A is parent:single level
//		B b1=new B();
//		b1.m2();//individual
//		b1.m1();//inherited 
		
		//C is child and B is parent & B is child for A:Multilevel 
		
//		C c1=new C();
//		c1.m1();//inherited
//		c1.m2();//inherited
//		c1.m3();//individual
//		
		//D is child and A is parent and A is parent for B class: Hierarchical inheritance 
		
		D d1=new D();
		d1.m1();//inherited
		d1.m4();//individual
		
		
		
		
		System.out.println("*************************");

		System.out.println("Scenario3: Parent class ref and Child class object: only Parent class method ");
		//B is child and A is parent:single level
//		A a2=new B();
//		a2.m1();//individual
		
		//C is child and B is parent & B is child for A:Multilevel 
		
//		B b2=new C();
//		b2.m1();//inherited
//		b2.m2();//individual
		
		//D is child and A is parent and A is parent for B class: Hierarchical inheritance
		A a2=new D();
		a2.m1();
		
		
		System.out.println("*************************");
		
		System.out.println("Scenario4: Child class ref and Parent class object: Invalid ");
		
		//B b2=new A();//Type mismatch: cannot convert from A to B
		
		
		

		
		

	}

}
