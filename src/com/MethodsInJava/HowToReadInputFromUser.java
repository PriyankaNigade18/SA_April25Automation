package com.MethodsInJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 1.System.in.read();
 * ----------------------
 * this method reads single byte as character and returns int type data
 * 
 * 2.BufferedReader class
 * ------------------------------
 * we need type casting for different type of data(By default accept 
 * everything as string)
 * 
 * 3.Scanner class
 * ----------------
 * Scanner class is available in java.util package
 * for any type we have method starts with next prefix
 * use method and read data
 * 
 * 
 */
public class HowToReadInputFromUser
{

	public static void main(String[] args) throws IOException
	{
		
		//Scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		
		System.out.println("Hello! your name is: "+name+" : "+"Your age is: "+age);
		
		
		
		
		
		
		/*2.BufferedReader class:type casting
		System.out.println("Enter your age:");
		
		//InputStreamReader class read data in a stream from console(System.in: input Stream)
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		//data reads in string
		String data=br.readLine();
		
		//string into int
		int age=Integer.parseInt(data);
		
		System.out.println("Hello your age is: "+age);
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		/*1.System.in.read()
		
		System.out.println("Enter your age");
		int age=System.in.read();
		System.out.println("Hello your age is: "+(char)age);
		
		*/
		
		
		
		

	}

}
