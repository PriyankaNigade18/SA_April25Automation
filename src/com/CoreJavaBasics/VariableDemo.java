package com.CoreJavaBasics;


/*
 * Variable is name of storage location
 * Java has three types
 * 1.Local
 * 2.Instance
 * 3.Static
 * 
 * 1.Local variable
 * --------------------
 * Any variable declared within a method or any block is called local
 * Scope: Within a method
 * Memory allocation:as soon as method executed memory will be allocated
 * Memory deallocation: After method execution memory deallocated
 * 
 * 2.Instance variable
 * -----------------------
 * Any variable declared inside the class outside method,block,constructor
 * and without static keyword if it is written then that variable is instance
 * 
 * scope: Within an object
 * Memory allocation: As Soon as object creates memory will be allocated
 * Memory deallocation: After object execution/ remove then memory deallocated
 * 
 * Note: Number of time you are creating object, instance variable will get new memory 
 * for every new object
 * 
 * all instance variable inside main() using object you can call
 *  
 *  3.static variable
 *  ---------------------
 *  Any variable declared inside the class outside method,block,constructor
 * and with static keyword if it is written then that variable is static 
 * 
 * For all object common data we declare as Static
 * To call static data/method object is not required
 *  
 * scope: Within a class
 * Memory allocation: As Soon as class loaded memory will be allocated
 * Memory deallocation: After class unloading then memory deallocated
 * 
 * Note: Static variable gets one time memory inside metaspace and same memory
 * shared with all object
 */


public class VariableDemo 
{
	//instance
	int id=101;
	String name="Ravi";
	
	//static variable
	static String cname="AISSPMS";
	
	
	
	public void show()
	{
		System.out.println("------show()------");
		int marks=90;//local variable
		System.out.println("Collage name is: "+cname);
		System.out.println("Student id is: "+id);
		System.out.println("Student name is: "+name);
		System.out.println("Marks from show(): "+marks);
		
	}
	
//	public void display()
//	{
//		//CError:marks cannot be resolved to a variable
//		//System.out.println("Marks is: "+marks);
//	}

	public static void main(String[] args) 
	{
		System.out.println("------Main()---------");
		int marks=100;//local
		System.out.println("Marks from main(): "+marks);
		System.out.println("Collage name is: "+cname);
		
		//object create
		VariableDemo v1=new VariableDemo();
		v1.show();
		
		System.out.println("-----instance data from main()-----");
		System.out.println("Student id : "+v1.id);
		System.out.println("Student name : "+v1.name);
		
	}

}








