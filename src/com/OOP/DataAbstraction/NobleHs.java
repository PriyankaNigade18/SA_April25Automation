package com.OOP.DataAbstraction;

//Multiple inheritance in java
public class NobleHs implements IMA,USMA
{
	
	public void medicalService()
	{
		System.out.println("NobleHs.....MedicalService");
	}

	@Override
	public void physio() {
		System.out.println("NobleHs.....PhysioService");
		
	}

	@Override
	public void dental() {
		System.out.println("NobleHs.....DentalService");
		
	}

	@Override
	public void nero() {
		System.out.println("NobleHs.....NeroService");
		
	}

	@Override
	public void cardio() {
		System.out.println("NobleHs.....CardioService");
		
	}

	@Override
	public void covid19Test() {
		System.out.println("NobleHs.....Covid19TestService");
		
	}

}
