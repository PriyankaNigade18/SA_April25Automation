package com.CollectionFramework;

import java.util.TreeSet;

/*
 * TreeSet is class implement Set interface
 * Underline data structure is SearchTree
 * Frequent operation is Search
 * It return sorted data
 * Null value and duplication not allowed
 * 
 */
public class TreeSetDemo {

	public static void main(String[] args) 
	{
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(23);
		ts.add(10);
		ts.add(5);
		ts.add(9);
		ts.add(1);
		ts.add(8);
		ts.add(3);
		ts.add(15);
		
		System.out.println(ts);
		System.out.println("Total elements: "+ts.size());
		
		System.out.println(ts.descendingSet());
		
		System.out.println("headSet() returns less than elements"+ts.headSet(9));
		
		System.out.println("tailSet() returns greater than and equals elements"+ts.tailSet(9));
		
		System.out.println("subset() return subset: "+ts.subSet(5, 15));//include 5 and exclude 15
		
		System.out.println("look for 50?: "+ts.contains(50));//false
		
		for(Integer i:ts)
		{
			System.out.println(i);
		}
		

	}

}
