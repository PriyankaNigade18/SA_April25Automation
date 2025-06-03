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
	public void deposit() {
		System.out.println("Axis......deposit()");
		
	}

	@Override
	public void rateOfInterest() {
		System.out.println("Axis......rateofinterest 7%()");
		
	}

}
