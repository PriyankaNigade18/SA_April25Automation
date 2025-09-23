package com.AppHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.Utility.BrowserProvider;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CRMHooks
{

	public WebDriver driver;
	
	@Before
	public void setUp()
	{
		System.out.println("Before will run before every scenario");
		// driver=new EdgeDriver();
		driver=BrowserProvider.setDriver("edge");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@After
	public void tearDown()
	{
		System.out.println("After will run after every scenario");
		driver.quit();
	}
}
