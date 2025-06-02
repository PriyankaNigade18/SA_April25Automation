package com.OOP.DataAbstraction;

public class AxisBank implements RBIBank{

		
	public void custData()
	{
		System.out.println("Axis...customer details!");
	}
	@Override
	public void withdraw() {
		System.out.println("Axis......Withdraw()");
		
	}

	@Override
	public void deposite() {
		System.out.println("Axis......deposite()");
		
	}

	@Override
	public void rateOfInterest() {
		System.out.println("Axis......rateofinterest 7%()");
		
	}

}
