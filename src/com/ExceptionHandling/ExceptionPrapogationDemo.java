package com.ExceptionHandling;

public class ExceptionPrapogationDemo {

	public static void main(String[] args)
	{

		//System.out.println(9/0);
		
		
		String s1="90***";
		System.out.println(s1+100);//90***100
		int num=Integer.parseInt(s1);
		System.out.println(num+100);//190
		

	}

}
