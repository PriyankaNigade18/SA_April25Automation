package com.OOP.Encapsulation;

import com.OOP.Inheritance.AccessModifierMain;

public class ModifiersInDifferentPackage extends AccessModifierMain{

	public static void main(String[] args) 
	{
		//different package and different class
		AccessModifierMain a1=new AccessModifierMain();
		System.out.println(a1.name);
		
		//only from child
		
		ModifiersInDifferentPackage m1=new  ModifiersInDifferentPackage();
		System.out.println(m1.name);
		System.out.println(m1.acno);

	}

}
