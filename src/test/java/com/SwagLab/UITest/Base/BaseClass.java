package com.SwagLab.UITest.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import com.SwagLab.UITest.Pages.*;
import com.SwagLab.UITest.Utilities.BrowserProvider;

public class BaseClass 
{
	//public variables + Annotations +Page class object
	public WebDriver driver;
	public P1_LoginPage lp;
	public P2_InventoryPage ip;
	public P3_CartPage cp;
	
	@BeforeClass
	@Parameters({"bname"})
	public void setUp(String bname)
	{
		driver=BrowserProvider.setDriver(bname);
		//driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		lp=new P1_LoginPage(driver);
		ip=new P2_InventoryPage(driver);
		cp=new P3_CartPage(driver);
	}
	
	
	
	

}
