package com.Constructors;


/* this keyword
	-----------------
	 this keyword refer current class object
	 current class instance variable and current class instance method
	 
	 this can be passed as an argument in the method call.


*/
public class ThisKeyworDemo4
{	int amount=10000;
	public void accept()
	{
		System.out.println("Accept() is calling....");
		
	}
	public void show(int i)//primitive parameter
	{
		System.out.println("show() is calling!: "+i);
		display(this);//this as argument to method
	}
		public void display(ThisKeyworDemo4 obj)
	{
		System.out.println("display() calling current class object info");
		System.out.println(obj.amount);
		obj.accept();
	}
		//pass argument of EmployeeData class object
		public void dataFromEmployee(EmployeeData obj)
		{
			obj.display();
		}
	public static void main(String[] args) 
	{
		ThisKeyworDemo4 t1=new ThisKeyworDemo4();
		t1.show(101);
		
		
		//pass argument of EmployeeData class object
		EmployeeData e1=new EmployeeData(201,"Smita");
		t1.dataFromEmployee(e1);
		
		

	}

}
