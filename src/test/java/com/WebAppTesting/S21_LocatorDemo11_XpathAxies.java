package com.WebAppTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S21_LocatorDemo11_XpathAxies {

	public static void main(String[] args)
	{
		// Create driver session
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/customers.html?email-name=sdasdsd%40gmail.com&password-name=zdfasd&submit-name=");
		
		System.out.println("Scenario1: get Parent tag name for John element");
		String parent=driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
		System.out.println("Parent tagname for John is: "+parent);//tr
		
		System.out.println("Scenario2: get grand parent tag name for John element");
		String gparent=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();
		System.out.println("Grand Parent tagname for John is: "+gparent);//tbody

		
		System.out.println("Scenario3: get number of childs for row 2");
		int childcount=driver.findElements(By.xpath("//tbody//tr[2]//child::td")).size();
		System.out.println("Total Childs for row number 2 are: "+childcount);//5
		
		
		System.out.println("Scenario4: after John all remaining rows:following");
		int rows=driver.findElements(By.xpath("//td[text()='John']//following::tr")).size();
		System.out.println("After John element total rows are: "+rows);//2
		
		//assignment
		System.out.println("Scenario5: after Ashley get all remaining data count:following");
		int totalData=driver.findElements(By.xpath("//td[text()='Ashley']//following::td")).size();
		System.out.println("after Ashley all remaining data count is: "+totalData);//23
		
			
		System.out.println("Scenario6: after Ashley get all siblings");
		System.out.println("Ashley all siblings are: "+driver.findElements(By.xpath("//td[text()='Ashley']//following-sibling::td")).size());
		
		System.out.println("Scenario7: Before Ashley get all siblings");
		System.out.println("Before Ashley all siblings are: "+driver.findElements(By.xpath("//td[text()='Ashley']//preceding-sibling::td")).size());
		
		System.out.println("Scenario8: Before Ashley get all rows count");
		System.out.println("Before Ashley row count is: "+driver.findElements(By.xpath("//td[text()='Ashley']//preceding::tr")).size());//2
		
		
		System.out.println("Scenario8: Before Ashley get all data count");
		System.out.println("Before Ashley all data count is: "+driver.findElements(By.xpath("//td[text()='Ashley']//preceding::td")).size());
		
		
		

	}

}
