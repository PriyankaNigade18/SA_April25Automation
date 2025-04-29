package com.CoreJavaBasics;

/*
 * String is collection of characters
 * String is class in java available in java.lang package
 * 
 */
public class StringTypeCasting {

	public static void main(String[] args)
	{
		
		//String Object to primitive
		
		String s1="200";
		System.out.println(s1+200);//200200
		//String --->int
		int number=Integer.parseInt(s1);
		System.out.println(number+200);//400
		
		
		String s2="67.88";
		System.out.println(s2+11.11);//67.8811.11
		//String----double
		double dvalue=Double.parseDouble(s2);
		System.out.println(dvalue+11.11);//78.99
		
		//String---->char with the method of string class it is possible: charAt(index):char
		String s3="A";
		
		char ch=s3.charAt(0);
		
		System.out.println(ch);//A
		
		
		/*
		 * Scenario: Test the bill amount it should be less than 10000
		 * 
		 *split(regexp)
		 *regular expression used for patter matching
		 */
		
		System.out.println("******************************************");
		
		String bill="Total bill is 5000 Thank you for order!";//"5000"
		
		//extract 5000 from the string:"5000"
		String data=bill.split(" ")[3];//"5000"
		
		//Convert it into number int
		int amount=Integer.parseInt(data);//5000
		
		//test it-conditional statement
		if(amount<10000)
		{
			System.out.println("Amount is: "+amount+" Amount validated....Test Pass.....");
		}
		else
		{
			System.out.println("Test Fail......");
		}
		
		
		
		
		
		

	}

}
