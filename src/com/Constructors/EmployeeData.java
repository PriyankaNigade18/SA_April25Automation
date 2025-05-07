package com.Constructors;

public class EmployeeData
{
	/*
	 * this keyword
	 * -----------------
	 * this keyword refer current class object
	 * current class instance variable and current class instance method
	 */
	
	//this can be used to refer current class instance variable.

	int id;
	String name;
	
	public EmployeeData(int id,String name)
	{
		System.out.println("Parameterized constructor....");
//		id=id;
//		name=name;
		
		this.id=id;
		this.name=name;
		
	}
	
	public void display()
	{
		System.out.println("display() is calling from employeeData");
		System.out.println("Employee id is: "+id);
		System.out.println("Employee name is: "+name);
	}
	
	public static void main(String[] args) 
	{
		EmployeeData e1=new EmployeeData(101,"Pooja");
		e1.display();
		
		System.out.println("******************");
		EmployeeData e2=new EmployeeData(102,"Sagar");
		e2.display();

	}

}
