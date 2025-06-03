package com.OOP.DataAbstraction;

public class BankTest {

	public static void main(String[] args)
	{
		System.out.println("Child class ref and child class object: parent+child");
		
		HDFC h1=new HDFC();
		h1.custDetails();//individual
		h1.withdraw();//inherited abstract method
		h1.deposit();//inherited abstract method
		h1.rateOfInterest();//inherited abstract method
		
		System.out.println("*********************");
		
		AxisBank a1=new AxisBank();
		a1.custData();
		a1.withdraw();
		a1.deposit();
		a1.rateOfInterest();
		
		System.out.println("parent class ref and child class object: parent");
		
		RBIBank r1=new HDFC();
		r1.withdraw();
		r1.deposit();
		r1.rateOfInterest();
		
		RBIBank r2=new AxisBank();
		r2.deposit();
		r2.withdraw();
		r2.rateOfInterest();
		
		
		

	}

}
