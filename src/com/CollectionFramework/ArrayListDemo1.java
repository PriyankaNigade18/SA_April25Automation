package com.CollectionFramework;

import java.util.ArrayList;

/*
 * ArrayList is class implement List interface
 * Underline data structure is Dynamic Array
 * Frequent operation is data retrieval
 * It is order collection
 * Duplication allowed
 * Internally Arraylist give us total 10 virtual segment
 * 
 * 
 */
public class ArrayListDemo1 {

	public static void main(String[] args)
	{
		//Generic way 1.type safe 2.no type casting
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(100);
		a1.add(200);
		a1.add(200);
		a1.add(300);
		a1.add(400);
		a1.add(500);
		
		System.out.println(a1);
		
		int number=a1.get(3);
		System.out.println(number);
		
		ArrayList<String> loc=new ArrayList<String>();
		
		
		ArrayList<Double> marks=new ArrayList<Double>();
		
		
		
		
		
		/*
		// Non generic way: 1.not type safe  2.type casting required
		
		//ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add("Sarang");
		a1.add('a');
		a1.add(20);
		a1.add(89.77);
		
		System.out.println(a1);
		int number=(int) a1.get(0);
		System.out.println(number);
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
