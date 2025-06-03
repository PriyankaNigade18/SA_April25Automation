package com.OOP.DataAbstraction;

public class TestHospital {

	public static void main(String[] args) 
	{
		System.out.println("child class ref and child class object");
		NobleHs n1=new NobleHs();
		n1.medicalService();//individual
		n1.dental();//inherited abstract method
		n1.physio();//inherited abstract method
		n1.cardio();//inherited abstract method
		n1.nero();//inherited abstract method
		n1.covid19Test();
		
		System.out.println("Parent class ref and child class object");
		
		IMA i1=new NobleHs();
		i1.dental();
		i1.physio();
		i1.covid19Test();
		
		
		
		USMA u1=new NobleHs();
		u1.cardio();
		u1.nero();
		u1.covid19Test();
		
		
	
		

		
	}

}
