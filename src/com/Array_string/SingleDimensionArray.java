package com.Array_string;

/*
 * Array is static data structure 
 * Array implemented in Java as Object
 * Array can store similar type of data/Object
 * Array store elements at index position
 * Types
 * ----------
 * 1. Single Dimension
 * 2. Multi Dimension
 * 
 * Ways to declare array
 * ----------------------
 * 1.Using new keyword
 * 2.Using literal
 * 
 * Iteration
 * ------------
 * 1.using simple for loop
 * 2.using literal
 * 
 */
public class SingleDimensionArray {

	public static void main(String[] args) 
	{

		//using new keyword
		int sid[]=new int[5];
		sid[0]=101;
		sid[1]=102;
		sid[2]=103;
		sid[3]=104;
		sid[4]=105;
		
		System.out.println("Total Ids are: "+sid.length);
		
		//get the single value: array name and index
		System.out.println(sid[3]);//104
		System.out.println(sid[2]);//0
		//System.out.println(sid[6]);//ArrayIndexOutOfBoundsException
		
		//to read complete array
		System.out.println("*******Iteration with for loop******");
		
		for(int i=0;i<5;i++)//index
		{
			System.out.println(sid[i]);
		}
		
		System.out.println("***************************");
		
		double marks[]=new double[3];
		marks[0]=56.77;
		marks[1]=67.77;
		marks[2]=74.48;
		
		System.out.println("Total array size: "+marks.length);//3
		
		System.out.println("Total:"+(marks[0]+marks[1]+marks[2]));
		
		//single data
		//System.out.println(marks[3]);//exception
		
		System.out.println(marks[2]);//74.48
		System.out.println("*****for loop********");
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
			
		}
		
		//sum of elements of array
		double sum=0.0;
		
		for(int i=0;i<marks.length;i++)
		{
			sum=sum+marks[i];
		}
		
		System.out.println("Total: "+sum);
		
		System.out.println("******************************");
		
		//default value for every object is null
		
		String loc[]=new String[4];
		loc[0]="Pune";
		loc[1]="Mumbai";
		loc[2]="Delhi";
		loc[3]="Satara";
		
		System.out.println("Total size of array: "+loc.length);//4
		
		for(int i=0;i<loc.length;i++)
		{
			System.out.println(loc[i]);
		}
		
		System.out.println("********************************");
		//real data: Object type
		Object empdata[]=new Object[5];
		
		empdata[0]="Sarang";
		empdata[1]="Pune";
		empdata[2]=40;
		empdata[3]='M';
		empdata[4]=9877665554L;
		
		for(int i=0;i<empdata.length;i++)
		{
			System.out.println(empdata[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
