package com.Array_string;
/*
 * String is class in java from java.lang package
 * String is collection of characters
 * String is immutable class
 * 
 * String declaration ways
 * ---------------------------
 * 1.using literal: string get store into string constant pool of jvm
 * 2.Using new keyword: string get store into heap area of jvm
 * 
 * String constant pool
 * ---------------------------
 * - duplication for string is not allowed
 * - It saves memory
 * 
 */
public class StringMethods {

	public static void main(String[] args)
	{
		
		//length()
		String s1="Hello All";
		System.out.println("Length is: "+s1.length());//9
		
		//To covert string toLowerCase() toUpperCase()
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//equality 1.equals() 2.equalsIgnoreCase()
		String s2="Hello All";
		String s3="hello all";
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equalsIgnoreCase(s3));//true
		
		//charAt(index):return character at index
		System.out.println(s1.charAt(7));//l
		//wrong indexing
		//System.out.println(s1.charAt(10));//StringIndexOutOfBoundsException
		
		//indexOf(char):Returns the index within this string of the first occurrence of the specified character
		System.out.println(s1.indexOf('l'));//2
		
		System.out.println(s1.indexOf('l',4));//7
		
		//lastIndex
		System.out.println(s1.lastIndexOf('l'));//8
		
		System.out.println(s1.indexOf('l',8));//8
		
		//trim(): ignore white space before and after the string
		
		String s4="        Welcome  all            ";
		System.out.println(s4);
		System.out.println(s4.trim());
		
		//contains():Partial match
		String act="Selenium WebDriver is an API for webui test";
		System.out.println("Look for API?: "+act.contains("API"));//true
		System.out.println("Look for Api?: "+act.contains("Api"));//false
		System.out.println("Look for testng?: "+act.contains("Testng"));//false
		
		//starts-with(prefix)
		System.out.println("String starts with Selenium?: "+act.startsWith("Selenium"));//true
		System.out.println("String starts with Sel?: "+act.startsWith("Sel"));//true
		System.out.println("String starts with S?: "+act.startsWith("S"));//true
		System.out.println("String starts with nium?: "+act.startsWith("nium"));//false
		
		//endsWith(suffix)
		System.out.println("String ends with test?: "+act.endsWith("test"));//true
		System.out.println("String ends with te?: "+act.endsWith("te"));//false
		System.out.println("String ends with st?: "+act.endsWith("st"));//true
		System.out.println("String ends with t?: "+act.endsWith("t"));//true
		
		
		//concat() or +
		
		String ss1="Hi";
		String ss2="Hello";
		
		System.out.println(ss1+" "+ss2);
		System.out.println(ss1.concat(" "+ss2));
		
		//substring
		String exp="Selenium WebDriver is Webui automation library";
		
		System.out.println("Substring from index 10: "+exp.substring(10));
		System.out.println("Substring fro index 9 to 37: "+exp.substring(9,38));//lastindex-1
		
		//isEmpty():Returns true if, and only if, length() is 0
		//isBlank():Returns true if the string is empty or contains only white space codepoints,otherwise false.
		
		String ss3="";
		System.out.println("Is string is blank?: "+ss3.isBlank());//true
		System.out.println("Is String empty?: "+ss3.isEmpty());//true
		
		String ss4=" ";
		
		System.out.println("Is string is blank?: "+ss4.isBlank());//true
		System.out.println("Is String empty?: "+ss4.isEmpty());//false
		
		
		
		//replace
		
		String ss5="Software testing";
		System.out.println("replace t as *: "+ss5.replace('t','*'));
		
		String ss6="Testng is automation framework and Testng is unit testing framework";
		System.out.println(ss6.replace("Testng","Junit"));
		
		
		//split(regular expression): pattern matching: return string []
		
		String tools="Selenium,Appium,Postman,Cypress,Playwright";
		System.out.println(tools);
		
		String arr[]=tools.split(",");
		System.out.println("Single element: "+arr[2]);
		
		
		String tool=tools.split(",")[2];
		System.out.println(tool);
		
		System.out.println("************");
		
		for(String i:arr)
		{
			System.out.println(i);
		}
		
		/*
		 * validate bill
		 * amount should be less than 10000
		 */
		
		
		String bill="Total amount is 6000";
		String data=bill.split(" ")[3];
		//string to int
		int amount=Integer.parseInt(data);
		
		if(amount<10000)
		{
			System.out.println("Amount match...Test pass");
		}else
		{
			System.out.println("Amount not match...Test Fail");
		}
		
		
		String number1="10,-10,20,-20";
		String ar[]=number1.split(",");
		
		int res[]=new int[4];
		
		for(int i=0;i<4;i++)
		{
			res[i]=Integer.parseInt(ar[i]);
		}
		
		System.out.println("iterate int arr");
		
		for(int i:res)
		{
			System.out.println(i);
			if(i>0)
			{
				System.out.println("positive number: "+i);
			}else
			{
				System.out.println("Negative number: "+i);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
