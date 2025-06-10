package com.CollectionFramework;

import java.util.ArrayList;

/*
 * ArrayList is class implement List interface
 * Underline data structure is Dynamic Array
 * Frequent operation is data retrieval
 * It is order collection
 * Duplication allowed
 * Internally Arraylist give us total 10 virtual segment
 * Methods
 * -------------
 * add(),get(),isEmpty(),size(),remove(),add(index,value),clear(),contains()
 * 
 */
public class ArrayListDemo2 {

	public static void main(String[] args)
	{
			ArrayList<Integer> a1=new ArrayList<Integer>();
			System.out.println("Is list empty?: "+a1.isEmpty());//true
			a1.add(77);
			a1.add(120);
			a1.add(20);
			a1.add(30);
			a1.add(11);
			a1.add(45);
			a1.add(77);
			a1.add(45);
			a1.add(null);
			
			
			System.out.println("After inserting elements Is list empty?: "+a1.isEmpty());//false
			System.out.println(a1);
			
			System.out.println("Total elements are: "+a1.size());
			
			//search -contains()
			System.out.println("Search for null?: "+a1.contains(null));//true
			System.out.println("Search for 50?: "+a1.contains(50));//false
			
			//remove any element
			//a1.remove(6);//null
			
			System.out.println(a1);
			
			//add element at any 3index position
			
			a1.add(3,150);
			
			System.out.println(a1);
			
			//sublist()
			System.out.println(a1.subList(0,4));//from index-0 --- lastindex-1(4-1=3)
			
			//indexOf():Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
			System.out.println(a1.indexOf(45));//6
			
			//lastIndexOf()
			System.out.println(a1.lastIndexOf(45));//8
			
			//equals(): two list of same size and same data/object:true
			ArrayList<Integer> a2=new ArrayList<Integer>();
			a2.add(10);
			a2.add(20);
			a2.add(30);
			
			ArrayList<Integer> a3=new ArrayList<Integer>();
			a3.add(10);
			a3.add(20);
			a3.add(30);
			
			System.out.println(a2.equals(a3));
			
			Object arr[]=a3.toArray();
			
			for(Object i:arr)
			{
				System.out.println(i);
			}
		
			
			
			
			
			

			

	}

}
