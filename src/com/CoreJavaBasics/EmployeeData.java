package com.CoreJavaBasics;

public class EmployeeData 
{
	//data-instance
	int empId;
	String empName;
	
	//method
	public void display()
	{
		System.out.println("Employee id is: "+empId);
		System.out.println("Employee Name is: "+empName);
	}
	
	public static void main(String[] args)
	{
		EmployeeData e1=new EmployeeData();
		e1.empId=101;
		e1.empName="Raj";
		e1.display();
		
		EmployeeData e2=new EmployeeData();
		e2.empId=201;
		e2.empName="Kiran";
		e2.display();
		
		

	}

}
