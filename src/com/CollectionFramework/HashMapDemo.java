package com.CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args)
	{

		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Wadgaosheri",411014);
		hm.put("Kharadi",411048);
		hm.put("Lohegaon",411047);
		hm.put("VimanNagar",411014);
		hm.put("Nigadi",411056);
		
		System.out.println(hm);
		System.out.println("Total Entries are: "+hm.size());
		System.out.println("look for key?: "+hm.containsKey("Nigadi"));//true
		System.out.println("look for key?: "+hm.containsKey("Satara"));//false
		System.out.println("look for value: "+hm.containsValue(411042));//false
		//to get any specific value
		System.out.println("Value for specific key:"+hm.get("VimanNagar"));//411014
		
		/*
		 * Entry in map is interface
		 * 1.for each loop
		 * 2.convert map into set --->iterator()
		 * 
		 */
		
		System.out.println("------------------------------");
		for(Entry<String,Integer> i:hm.entrySet())
		{
			//System.out.println(i);
			System.out.println(i.getKey()+" : "+i.getValue());
		}
		
		System.out.println("------------------------------");

		//convert map into set
		Set<Entry<String,Integer>> set=hm.entrySet();
		
		Iterator<Entry<String,Integer>> ir=set.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
		
		
		
		
		

	}

}
