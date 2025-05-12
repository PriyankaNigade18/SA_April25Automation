package com.ControlFlow;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args)
	{
		// ladder if
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.nextLine().charAt(0);
		
		
		//Applicable for Key with value: not applicable for grading mechanism
		switch (ch)
		{
		case 'a':
			System.out.println(ch+" is vowel");
			break;
		case 'e':
			System.out.println(ch+" is vowel");
			break;
		case 'i':
			System.out.println(ch+" is vowel");
			break;//break take control outside of switch block and loop
		case 'o':
			System.out.println(ch+" is vowel");
			break;
		case 'u':
			System.out.println(ch+" is vowel");
			break;
			

		default:
			System.out.println("It is an alphabet");

		}
		
		
		
		/*
		if(ch=='a')
		{
			System.out.println(ch+" is vowel");
		}else if(ch=='e')
		{
			System.out.println(ch+" is vowel");
		}else if(ch =='i')
		{
			System.out.println(ch+" is vowel");
		}else if(ch=='o')
		{
			System.out.println(ch+" is vowel");
		}else if(ch=='u')
		{
			System.out.println(ch+" is vowel");
		}else
		{
			System.out.println("It is an alphabet");
		}
		
		*/
		

	}

}
