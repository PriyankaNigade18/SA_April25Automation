package com.ExceptionHandling;

public class ThrowKeywordDemo {

	public static void main(String[] args) throws StringIsNullException 
	{

		String s1=null;
		
		if(s1==null)
		{
			throw new StringIsNullException("Null String");
		}
		

	}

}
