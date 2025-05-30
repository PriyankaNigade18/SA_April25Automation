package com.OOP.Inheritance;

public class AccessModifierMain
{
	
		int id=101;
		public String name="Jay";
		private long phno=9887776;
		protected int acno=888888;
	
	
	
	public static void main(String args[])
	{
		//same class
		AccessModifierMain a1=new AccessModifierMain();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
		System.out.println(a1.acno);
		
	}

}
