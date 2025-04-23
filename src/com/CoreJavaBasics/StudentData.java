package com.CoreJavaBasics;

public class StudentData 
{

	//data declaration-instance
	int id;
	String name;
	
	
	//method
	public void show()
	{
		System.out.println("Student Id is: "+id);
		System.out.println("Student Name is: "+name);
	}
	
		
	public static void main(String args[]) 
	{
		/*
		 * To access member of a class we need Object
		 * 
		 */
		
		
		StudentData s1=new StudentData();
		s1.show();//default values
		
		s1.id=101;
		s1.name="Sarang";
		s1.show();
		
		System.out.println("--------------------");
		
		StudentData s2=new StudentData();
		s2.show();
		
		s2.id=102;
		s2.name="Smita";
		s2.show();
		
		
		



	}

}
