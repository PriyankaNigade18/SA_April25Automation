package com.Constructors;

public class InstanceVsStaticVariable 
{
	//instance variable : for every new object new memory created
	//int count=1;
	//static variable: it will get one time memory and same memory shared with all object
	static int count=1;
	
	InstanceVsStaticVariable ()
	{
		System.out.println(count);
		count++;
		
	}

	public static void main(String[] args)
	{
		InstanceVsStaticVariable i1=new InstanceVsStaticVariable();
		InstanceVsStaticVariable i2=new InstanceVsStaticVariable();
		InstanceVsStaticVariable i3=new InstanceVsStaticVariable();
		InstanceVsStaticVariable i4=new InstanceVsStaticVariable();
		InstanceVsStaticVariable i5=new InstanceVsStaticVariable();
		

	}

}
