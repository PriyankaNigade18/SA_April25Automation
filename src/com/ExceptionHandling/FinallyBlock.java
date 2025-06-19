package com.ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) 
	{
		/*
		 * Finally block used to execute special code
		 * It will always run with or without exception
		 * Finally block we can write with try block
		 * 
		 * scenarios:
		 * Database server,server start and stop
		 * file reading,close connection
		 */
		
		System.out.println("Program started......");
		try {
			System.out.println("Division is:"+(9/0));
			}
		catch(ArithmeticException a)
		{
			System.out.println("Use other number than 0");
			
		}
		finally {
		System.out.println("Finally block is excuting.....");	
		}
		System.out.println("Program ends.......");

	}

}
