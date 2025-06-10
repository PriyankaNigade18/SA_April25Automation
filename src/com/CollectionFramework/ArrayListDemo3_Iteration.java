package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
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
 * Iteration Ways
 * -------------------
 * 1.Simple for loop
 * 2.for each loop
 * 3.using iterator()
 * 4.using listIterator()
 * 
 */
public class ArrayListDemo3_Iteration {

	public static void main(String[] args)
	{

		ArrayList<Object> empdata=new ArrayList<Object>();
		if(empdata.isEmpty())
		{
			empdata.add("Sarang");
			empdata.add(30);
			empdata.add("Pune");
			empdata.add('M');
			empdata.add(89.77);
		}
		
		System.out.println("Is list empty?: "+empdata.isEmpty());
		System.out.println("Total elements are: "+empdata.size());
		//single data
		System.out.println(empdata.get(0));//Sarang
		
		System.out.println(empdata);
		
		System.out.println("***************Simple for loop******************");
		
		
		for(int i=0;i<empdata.size();i++)
		{
			System.out.println(empdata.get(i));
		}
		
		System.out.println("***************For each loop******************");
		
		for(Object i:empdata)
		{
			System.out.println(i);
		}
		System.out.println("***************Using iterator()******************");
		/*
		 * iterator() returns Iterator interface object
		 * 
		 * Iterator interface have two methods
		 * -----------------------
		 * 1.hasNext():Returns true if the iteration has more elements.
		 * 2.next():Returns the next element in the iteration.
		 * 
		 */
		
		Iterator<Object> ir=empdata.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		//only applicable for List interface
		System.out.println("***************Using listIterator()******************");

		ListIterator<Object> list=empdata.listIterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		
		
		System.out.println("--------Reverse order-------");
		
		while(list.hasPrevious())
		{
			System.out.println(list.previous());
		}
		
		
		System.out.println("---------------------List Scenarios--------------------");
		
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		System.out.println(l1);
		System.out.println("----------------");
		
		//constructor to add elements from one list into other list
		ArrayList<Integer> l2=new ArrayList<Integer>(l1);
		l2.add(40);
		l2.add(50);
		System.out.println(l2);
		System.out.println("----------------");
		
		//quick list use Arrays class
		List<Integer> l3=Arrays.asList(100,200,300);
		System.out.println(l3);
		System.out.println("----------------");
		
		//create new list which is combination(merge) of l1+l3
		ArrayList<Integer> newList=new ArrayList<Integer>();
		newList.addAll(l1);
		newList.addAll(l3);
		newList.add(1000);
		
		System.out.println(newList);
		
		System.out.println("------------------");
		
		/*
		 * What is Collection and Collections
		 * Collection is interface
		 * Collections is class and it has all static methods
		 */
		List<Integer> l4=Arrays.asList(100,45,12,90,11,56,10);
		
		System.out.println(l4);
		//sort the list
		Collections.sort(l4);
		
		System.out.println(l4);
		
		
		
		
		
		
		
		
		
		

	}

}
