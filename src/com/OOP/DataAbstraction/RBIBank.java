package com.OOP.DataAbstraction;

public interface RBIBank 
{
	/*
	 * Interface is special class which has 
	 * all methods are public and abstract
	 * data is static and Final 
	 * 
	 * Abstract method implemented by child class
	 * relation: implements keyword
	 * 
	 * 100% abstraction is possible
	 * 
	 */
	
	int amount=100;
	
	void withdraw();
	void deposit();
	void rateOfInterest();
	
	

}
