
package com.OOP.Inheritance;

public class CarTest {

	public static void main(String[] args)
	{

		System.out.println("Parent ref and parent object");
		
		Vehical v1=new Vehical();
		v1.breakFeature();
		
		System.out.println("************");
		Car c1=new Car();
		c1.start();//individual
		c1.refule();//individual
		c1.stop();//individual
		c1.breakFeature();
		
		
		System.out.println("Child class ref and child class object");
		
		BMW b1=new BMW();
		b1.autoEngine();//individual
		b1.start();//inherited
		b1.refule();//inherited
		b1.stop();//inherited
		b1.breakFeature();
		
		System.out.println("*****************");
		//child audi
		Audi a1=new Audi();
		a1.autoGear();//individual
		a1.start();//inherited
		a1.refule();//inherited
		a1.stop();//inherited
		a1.breakFeature();
		
		
		System.out.println("parent class ref and child class object");
		
		Car c2=new BMW();
		c2.start();//individual
		c2.refule();//individual
		c2.stop();//individual
		c2.breakFeature();
		
		System.out.println("***************");
		Car c3=new Audi();
		c3.start();//individual
		c3.refule();//individual
		c3.stop();//individual
		c3.breakFeature();

		
		Vehical v2=new Car();
		v2.breakFeature();
		
		

	}

}
