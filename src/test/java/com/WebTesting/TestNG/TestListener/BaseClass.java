package com.WebTesting.TestNG.TestListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://automationplayground.com/crm/");
		
	}

}
