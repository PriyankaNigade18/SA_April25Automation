package com.CoreJavaBasics;

public class AccessModifiers 
{

	//data
	int id=101;//default
	public String name="Sarang";
	private long phno=8765543332L;
	
	
	
	public static void main(String[] args) 
	{
		//object-same class
		AccessModifiers a1=new AccessModifiers();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);

	}

}
