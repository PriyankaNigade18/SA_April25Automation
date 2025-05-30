package com.OOP.Inheritance;


//final class Demo
class Demo
{
	final int x=100;
	
	public final void display()
	{
		System.out.println("Hello All Java is about to complete!");
	}
}




public class FinalKeywordDemo extends Demo
{

//	@Override
//	public void display()
//	{
//		System.out.println("Hello All Java is about to complete!");
//		System.out.println("We are starting Selenium in Next week");
//		
//	}
	public static void main(String[] args) 
	{
		FinalKeywordDemo f1=new FinalKeywordDemo();
		f1.display();
		
		System.out.println(f1.x);//100
		//f1.x=300;
		System.out.println(f1.x);//300-->100
		
		

	}

}
