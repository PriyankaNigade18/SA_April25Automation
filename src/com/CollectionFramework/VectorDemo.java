package com.CollectionFramework;

import java.util.Vector;

/*
 * Vector is class implement List interface
 * Underline data structure is Dynamic Array
 * It is Synchronize class
 * Performance is slow
 */
public class VectorDemo {

	public static void main(String[] args) 
	{

		Vector<Integer> v1=new Vector<Integer>();
		v1.add(90);
		v1.add(10);
		v1.add(30);
		v1.add(100);
		v1.add(20);
		v1.add(10);
		
		System.out.println("Total Elements: "+v1.size());
		System.out.println(v1);
		
		System.out.println("-----------------");
		for(Integer i:v1)
		{
			System.out.println(i);
		}
	}

}
