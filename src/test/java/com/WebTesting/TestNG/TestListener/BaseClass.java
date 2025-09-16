package com.WebTesting.TestNG.TestListener;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.aventstack.chaintest.plugins.ChainTestListener;

public class BaseClass 
{
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://automationplayground.com/crm/");
		
	}
	
	//attached screenshot for failure
	@AfterMethod
	public void getScreenshot(ITestResult result)
	{
		if(!result.isSuccess())
		{
		TakesScreenshot ts=(TakesScreenshot)driver;
		byte arr[]=ts.getScreenshotAs(OutputType.BYTES);
		ChainTestListener.embed(arr,"image/png");
		}
	}

}
