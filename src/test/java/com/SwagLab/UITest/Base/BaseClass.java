package com.SwagLab.UITest.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import com.SwagLab.UITest.Pages.*;

public class BaseClass 
{
	//public variables + Annotations +Page class object
	public WebDriver driver;
	public P1_LoginPage lp;
	public P2_InventoryPage ip;
	
	@BeforeTest
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		lp=new P1_LoginPage(driver);
		ip=new P2_InventoryPage(driver);
	}
	
	
	
	

}
