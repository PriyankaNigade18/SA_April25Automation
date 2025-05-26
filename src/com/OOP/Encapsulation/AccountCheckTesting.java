package com.OOP.Encapsulation;

public class AccountCheckTesting {

	public static void main(String[] args)
	{
		AccountCheck ac=new AccountCheck();
		//positive
		ac.setAmount(2000);

		System.out.println("Balance is: "+ac.getAmount());
		
		System.out.println("******************");
		//Negative
		ac.setAmount(500);
		System.out.println("Balance is: "+ac.getAmount());
		
		
	}

}
