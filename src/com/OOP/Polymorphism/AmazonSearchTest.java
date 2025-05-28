package com.OOP.Polymorphism;

public class AmazonSearchTest {

	public static void main(String[] args)
	{
		AmazonSearch a1=new AmazonSearch();
		a1.search(90000);
		a1.search("laptop");
		a1.search("bag","zara");
		a1.search(80000,"Mobile");
		a1.search("laptop",999000,"Mac pro");

	}

}
