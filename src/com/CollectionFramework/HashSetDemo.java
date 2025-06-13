package com.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

/*
 * HashSet is class implement Set interface
 * Underline data structure is HashTable
 * By default 16 segment it creates[0 to 15 index]
 * Frequent operation is Search
 * 
 * HashTable maintains data as per hashing() /hash function
 * where for every object you will get hashcode and key and based
 * on key and code index generated and then data inserted into table as per node
 * structure
 * |key|hashcode|object|Next element address|
 * 
 * one null value allowed
 * hashcode and idex= 0
 * 
 * Set interface is not order collection and duplication not allowed 
 */
public class HashSetDemo {

	public static void main(String[] args)
	{
			HashSet<Integer> hs=new HashSet<Integer>();
			if(hs.isEmpty())
			{
				hs.add(10);
				hs.add(20);
				hs.add(30);
				hs.add(40);
				hs.add(20);
				hs.add(50);
				hs.add(null);
			}
			
			System.out.println(hs);
			System.out.println("Total Elements: "+hs.size());
			
			//search 100
			System.out.println("look for 100?: "+hs.contains(100));//false
			System.out.println("look for 50?: "+hs.contains(50));//true
			
			//remove null
			hs.remove(null);
			
			System.out.println(hs);
			
			System.out.println("********Ietration using for-each*****");
			
			for(Integer i:hs)
			{
				System.out.println(i);
			}
			
			System.out.println("********Ietration using iterator()*****");
			
			Iterator<Integer> ir=hs.iterator();
			while(ir.hasNext())
			{
				System.out.println(ir.next());
			}
			
			

			
			
			
			
			
			
			
				
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
