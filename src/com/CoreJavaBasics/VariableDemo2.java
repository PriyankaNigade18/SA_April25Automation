package com.CoreJavaBasics;

public class VariableDemo2
{
	//instance variable
	int id=101;
	
	static String cname="AISSPM";
	
	//instance method
	public void accept()
	{
		String loc="Pune";//local
		System.out.println(id);
		System.out.println("location is: "+loc);
		System.out.println(cname);
	}
	//instance method
	public void show()
	{
		System.out.println(id);
		System.out.println(cname);
		//System.out.println("location is: "+loc);
	}

	public static void main(String[] args)
	{

		//object
		System.out.println(cname);
		
		VariableDemo2 v1=new VariableDemo2();
		System.out.println(v1.id);

		v1.accept();
		
		v1.show();
	}
	

}
