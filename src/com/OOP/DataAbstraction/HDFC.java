package com.OOP.DataAbstraction;

public class HDFC implements RBIBank
{
	
	
	public void custDetails()
	{
		System.out.println("HDFC......Customer data!");
	}

	@Override
	public void withdraw() {
		System.out.println("HDFC......Withdraw()");

		
	}

	@Override
	public void deposit() {
		System.out.println("HDFC......deposit()");
	}

	@Override
	public void rateOfInterest() {
		System.out.println("HDFC......rateofinetrest=8%()");
		
	}

}
