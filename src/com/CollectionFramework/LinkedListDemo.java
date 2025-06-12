package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
 * LinkedList is class implements List interface
 * Underline data structure is DublyLinkedList
 * Frequent operation is insertion and deletion
 * Insertion order maintain(index based)
 * Duplication allowed
 * faster than arrayList
 */
public class LinkedListDemo {

	public static void main(String[] args) 
	{

		LinkedList<Integer> ls=new LinkedList<Integer>();
		
		if(ls.isEmpty())
		{
			ls.add(28);
			ls.add(11);
			ls.add(30);
			ls.add(90);
			ls.add(22);
			ls.add(28);
			ls.add(10);
		}
		
		System.out.println("After inserting elements Is list empty?: "+ls.isEmpty());
		
		System.out.println("Total elements : "+ls.size());
		
		System.out.println(ls);
		
		//insert 4th position 67
		ls.add(4,67);
		
		System.out.println(ls);
		
		ls.addFirst(1000);
		ls.addLast(2000);
		System.out.println(ls);
		
		System.out.println("get the element at 3rd position: "+ls.get(3));//30
		
		System.out.println(ls.getFirst());
		System.out.println(ls.getLast());
		
		//delete-remove()
		ls.remove(4);
		
		//System.out.println(ls);
		
		//clear the list(all the elements removes)

		System.out.println(ls);//[1000, 28, 11, 30, 67, 22, 28, 10, 2000]
		System.out.println(ls.size());//9
		
//		ls.clear();
//		System.out.println(ls);//[]
//		System.out.println(ls.size());//0
		
		System.out.println("******************Iteration using for loop*************");
		
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}
		
		System.out.println("******************Iteration using forEach loop*************");

		for(Integer i:ls)
		{
			System.out.println(i);
		}
		
		System.out.println("******************Iteration using iterator()*************");
		
		Iterator<Integer> ir=ls.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		System.out.println("******************Iteration using listIterator()*************");
		
		ListIterator<Integer> lr=ls.listIterator();
		
		while(lr.hasNext())
		{
			System.out.println(lr.next());
		}
		
		System.out.println("-----------------");
		
		while(lr.hasPrevious())
		{
			System.out.println(lr.previous());
		}
		
		
		System.out.println("------------Collections class- -------------");
		
		System.out.println(ls);
		
		Collections.sort(ls);
		
		System.out.println(ls);
		
		System.out.println("Max element: "+Collections.max(ls));

		System.out.println("Min element: "+Collections.min(ls));
	
	// copy
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		//List<Integer> l2=new LinkedList<Integer>();
	
		List<Integer> l2=new ArrayList<Integer>(5);
		l2.add(0);
		l2.add(0);
		l2.add(0);
		
		System.out.println(l2);
		
		Collections.copy(l2,l1);
		
		
		System.out.println(l2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
