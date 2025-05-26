package com.OOP.Encapsulation;

public class AccountCheck 
{
	//data
	private int amount=0;
	
	//public methods
	public void setAmount(int amount)
	{
		if(amount>=1000)
		{
			this.amount=amount;
			System.out.println("Amount is initialized...!");
		}else
		{
			this.amount=amount;
		}
	}
	
	public int getAmount()
	{
		if(this.amount>=1000)
		{
		System.out.println("Valid Amount....Account is activated!");
		return amount;
		}else
		{
			System.out.println("Insufficient Amount....Account is not activated!");
			return amount;
		}
	}
	

}
