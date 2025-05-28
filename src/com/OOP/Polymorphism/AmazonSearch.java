package com.OOP.Polymorphism;

public class AmazonSearch
{
	
	public void search(String pname)
	{
		System.out.println("Product search by product name: "+pname);
	}
	
	public void search(int price)
	{
		System.out.println("Product search by product price: "+price);
	}
	
	public void search(String pname,int price)
	{
		System.out.println("Product search by product name: "+pname+" & product price: "+price);
	}

	
	public void search(int price,String pname)
	{
	
		System.out.println("Product search by product price: "+price+" & product name: "+pname);
	}
	
	public void search(String pname,String bname)
	{
		System.out.println("Product search by product name: "+pname+" & product brand name: "+bname);
	}
	
	
	public void search(String pname,int price,String bname)
	{
		System.out.println("Product search by product name: "+pname+" & product price: "+price+" & product brand name: "+bname);
	}
}
