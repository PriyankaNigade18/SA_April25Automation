package com.OOP.Encapsulation;


class Employee
{
	//Encapsulation=private data + public method
	private int id=101;
	private String name="Sarang";
	private int sal=60000;
	
		
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getSal() {
		return sal;
	}




	public void setSal(int sal) {
		this.sal = sal;
	}




	public void show()
	{
		System.out.println("Id is: "+id);
		System.out.println("name is: "+name);
		System.out.println("salary: "+sal);
	}
	
}


public class EncapsulationDemo 
{

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.show();
		
		e1.setSal(900000);
		
		e1.show();
		
		
//		e1.id=201;
//		e1.name="sara";
//		e1.sal=56777;
		
		//e1.show();

	}

}
