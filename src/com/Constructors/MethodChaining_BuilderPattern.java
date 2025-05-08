package com.Constructors;

/* this keyword
-----------------
 this keyword refer current class object
 current class instance variable and current class instance method
 
this can be used to return the current class instance from the method.



*/
public class MethodChaining_BuilderPattern
{
	//Method--->Object
	public MethodChaining_BuilderPattern startApp()
	{
		System.out.println("Application started....");
		return this;
	}

	//method--->object
	public MethodChaining_BuilderPattern runApp()
	{
		System.out.println("Application is executing....");
		return this;
	}
	
	
	public void stopApp()
	{
		System.out.println("Application stopped...");
	}
	
	//return EmployeeData object
	public EmployeeData runDisplay()
	{
		return new EmployeeData(111,"Raju");
	}
	
	public static void main(String[] args)
	{
		MethodChaining_BuilderPattern obj=new MethodChaining_BuilderPattern();
		//obj.startApp().runApp().stopApp();
		
		obj.startApp().runApp().runDisplay().display();

	}

}
