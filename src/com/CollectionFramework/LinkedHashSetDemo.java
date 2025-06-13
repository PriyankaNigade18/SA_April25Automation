package com.CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/*
 * LinkedHashSet is child class of HashSet
 * Underline data structure is LinkedList and Hashtable
 * Insertion order maintains:list
 * Duplication not allowed:set
 * 
 */
public class LinkedHashSetDemo {

	public static void main(String[] args)
	{
			LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
			ls.add(10);
			ls.add(20);
			ls.add(30);
			ls.add(40);
			ls.add(10);
			ls.add(40);
				
			System.out.println("Total elements: "+ls.size());
			
			System.out.println(ls);
			
			ls.addFirst(100);
			ls.addLast(200);

			System.out.println(ls);
			
			//remove
			ls.remove(10);
			
			System.out.println(ls);
			
			/*
			 * 1.Declare list and write logic to remove duplicate elements from list
			 * Solution: convert List into set
			 * 
			 */

			
			ArrayList<Integer> al=new ArrayList<Integer>();
			al.add(10);
			al.add(20);
			al.add(40);
			al.add(30);
			al.add(40);
			al.add(20);
			
			
			System.out.println(al);
			
			LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>(al);
			System.out.println(hs);
			
			
//			HashSet<Integer> hh=new HashSet<Integer>(al);
//			System.out.println(hh);
			
			/*
			 * Assignment: LinkedHashSet
			 * 2.How to remove duplicate characters from String
			 * String s1="aabbccddee"
			 * 
			 */
			
			
			
	}

}
